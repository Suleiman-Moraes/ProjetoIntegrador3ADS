package persistencia;

import enuns.Sexo;
import enuns.StatusMotorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Motorista;
import util.Conexao;
import util.Fabrica;
import util.Ultilidades;

public class MotoristaDao extends GenericDao<Motorista> {

    @Override
    protected Motorista devolverObjeto(ResultSet rs) throws SQLException {
        while (rs.next()) {
            return new Motorista(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), 
                    rs.getString("telefone"), rs.getString("email"), rs.getString("login"), rs.getString("senha"), 
                    Ultilidades.pegaDataDevolveData(rs.getDate("data_nascimento")),
                    new EnderecoDao().visualizarUm(rs.getInt("id_endereco")), 
                    (Sexo)Fabrica.getInstance(Sexo.values(), rs.getString("sexo")),
                    rs.getString("cnh"),
                    (StatusMotorista)Fabrica.getInstance(StatusMotorista.values(), rs.getString("status_motorista")), 
                    new VeiculoDao().visualizarUm(rs.getInt("id_veiculo")));
        }
        return null;
    }

    @Override
    protected PreparedStatement prepararParaInserir_alterar(Motorista t, Connection con, String sql) throws SQLException {
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
            ps.setString(10, t.getCnh());
            ps.setString(11, t.getStatusMotorista().getDescricao());
            ps.setInt(12, t.getVeiculo().getId());

            if (t.getId() > 0) {
                ps.setInt(13, t.getId());
            }

            return ps;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void inserir(Motorista t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO motorista (nome, cpf, telefone, email, login, senha, data_nascimento, id_endereco, sexo, cnh, status_motorista, id_veiculo)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            String curral = "SELECT currval('motorista_id_seq') as id";
            this.inserir_alterar(t, con, sql, curral);
            con.commit();
        } catch (SQLException e) {
            con.rollback();
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "DELETE FROM motorista"
                    + "WHERE id =  ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (int) object[0]);
            ps.execute();

            con.commit();
        } catch (SQLException e) {
            con.rollback();
        }
    }

    @Override
    public void alterar(Motorista t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE motorista SET"
                    + "nome = ? , "
                    + "cpf = ? ,"
                    + "telefone = ? ,"
                    + "email = ? ,"
                    + "login = ? ,"
                    + "senha = ? ,"
                    + "data_nascimento = ? ,"
                    + "id_endereco = ? ,"
                    + "sexo = ? ,"
                    + "cnh = ? ,"
                    + "status_motorista = ? ,"
                    + "id_veiculo = ?"
                    + "WHERE id = ?;";
            this.inserir_alterar(t, con, sql);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public Motorista visualizarUm(Object... object) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            List<Motorista> lista = new ArrayList<>();
            String condicao = " AND id = "+(int)object[0];
                    ;//haha vai ter q concatenar na mão kkk
            lista = this.visualizar(con, "motorista", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Motorista> visualizarAll() throws SQLException {
        try {
//            String sql = "SELECT id, nome, cpf, telefone, login, senha, data_nascimento, endereco, sexo, cnh, status_motorista, veiculo"
//                    + "FROM motorista ORDER BY nome;";
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "motorista", "");
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Motorista> buscarMotoristasPassandoParametros(String... condicao) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "motorista", condicao);
        } catch (Exception e) {
            return null;
        }
    }
}
