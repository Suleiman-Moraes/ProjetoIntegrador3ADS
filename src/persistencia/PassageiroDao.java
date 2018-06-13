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
        while (rs.next()) {
            return new Passageiro(rs.getInt(""), rs.getString(""), rs.getString(""), 
                    rs.getString(""), rs.getString(""), rs.getString(""), rs.getString(""), 
                    Ultilidades.pegaDataDevolveData(rs.getDate("")), 
                    new EnderecoDao().visualizarUm(rs.getInt("")), 
                    (Sexo)Fabrica.getInstance(Sexo.values(), rs.getString("")), 
                    (StatusPassageiro)Fabrica.getInstance(StatusPassageiro.values(), rs.getString("")));//Incompleto
        }
        return null;
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
            ps.setInt(8, t.getEndereco().getId());//endereco
            ps.setString(9, t.getSexo().getDescricao());

            if(t.getId() > 0){
                ps.setInt(10, t.getId());
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
            String sql = "instrucao sql";
            String curral = "SELECT currval('squencia');";
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
            String sql = "instrucao sql";
            
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
            String sql = "instrucao sql";
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
            List<Passageiro> lista = new ArrayList<>();
            String condicao = "";//haha vai ter q concatenar na mão kkk
            lista = this.visualizar(con, "Nome da tabela", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Passageiro> visualizarAll() throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "Nome da tabela", "");
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Passageiro> bucarPassageirosPassandoParametros(String... condicao) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "Nome da tabela", condicao);
        } catch (Exception e) {
            return null;
        }
    }
}
