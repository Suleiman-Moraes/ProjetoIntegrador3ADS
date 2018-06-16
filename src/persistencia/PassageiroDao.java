package persistencia;

import enuns.Sexo;
import enuns.StatusPassageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Passageiro;
import util.Conexao;
import util.Fabrica;
import util.Ultilidades;

public class PassageiroDao extends GenericDao<Passageiro>{

    @Override
    protected Passageiro devolverObjeto(ResultSet rs) throws SQLException {
        return new Passageiro(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), 
                rs.getString("telefone"), rs.getString("email"), rs.getString("login"), rs.getString("senha"), 
                Ultilidades.pegaDataDevolveData(rs.getDate("data_nascimento")), 
                new EnderecoDao().visualizarUm(rs.getInt("id_endereco")), 
                (Sexo)Fabrica.getInstance(Sexo.values(), rs.getString("sexo")), 
                (StatusPassageiro)Fabrica.getInstance(StatusPassageiro.values(), rs.getString("status_passageiro")));//Incompleto
    }

    @Override
    protected PreparedStatement prepararParaInserir_alterar(Passageiro t, Connection con, String sql) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNome());
            ps.setString(2, t.getCpf());
            ps.setString(3, t.getTelefone());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getLogin());
            ps.setString(6, t.getSenha());
            ps.setDate(7, Ultilidades.pegaDataDevolveData(t.getDataDeNascimento()));
            ps.setString(8, t.getSexo().getDescricao());
            ps.setString(9, t.getStatusPassageiro().getDescricao());
            ps.setInt(10, t.getEndereco().getId());//endereco

            if(t.getId() > 0){
                ps.setInt(11, t.getId());
            }
            
            return ps;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void inserir(Passageiro t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO passageiro (nome, cpf, telefone, email, login, senha, data_nascimento, sexo, status_passageiro, id_endereco)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?)";
            String curral = "SELECT currval('passageiro_id_seq');";
            this.inserir_alterar(t, con, sql, curral);
            con.commit();
        }catch(Exception e){
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "DELETE FROM passageiro"
                    + "WHERE id =  ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (int)object[0]);
            ps.execute();
            
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public void alterar(Passageiro t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE passageiro SET"
                    + " nome = ? ,"
                    + " cpf = ? ,"
                    + " telefone = ? ,"
                    + " email = ? ,"
                    + " login = ? ,"
                    + " senha = ? ,"
                    + " data_nascimento = ? ,"
                    + " sexo = ? ,"
                    + " status_passageiro = ? ,"
                    + " id_endereco = ?"                    
                    + " WHERE id = ?;";
            this.inserir_alterar(t, con, sql);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public Passageiro visualizarUm(Object... object) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            con.setAutoCommit(true);
            List<Passageiro> lista = new ArrayList<>();
            String condicao = " AND id = ";
            condicao += (int)object[0];//haha vai ter q concatenar na mão kkk
            lista = this.visualizar(con, "passageiro", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Passageiro> visualizarAll() throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            con.setAutoCommit(true);
            return this.visualizar(con, "passageiro", "");
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Passageiro> bucarPassageirosPassandoParametros(String... condicao) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            con.setAutoCommit(true);
            return this.visualizar(con, "passageiro", condicao);
        } catch (Exception e) {
            return null;
        }
    }
}
