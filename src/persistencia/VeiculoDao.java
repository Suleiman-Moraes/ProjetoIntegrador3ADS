package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;
import util.Conexao;

public class VeiculoDao extends GenericDao<Veiculo> {

    @Override
    protected Veiculo devolverObjeto(ResultSet rs) throws SQLException {
        while (rs.next()) {
            return new Veiculo(rs.getInt("id"), rs.getString("modelo"), rs.getString("marca"),
                    rs.getString("cor"), rs.getInt("assentos"), rs.getString("placa"));
        }
        return null;
    }

    @Override
    protected PreparedStatement prepararParaInserir_alterar(Veiculo t, Connection con, String sql) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getModelo());
            ps.setString(2, t.getMarca());
            ps.setString(3, t.getCor());
            ps.setInt(4, t.getAssentos());
            ps.setString(5, t.getPlaca());

            if (t.getId() > 0) {
                ps.setInt(6, t.getId());
            }

            return ps;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void inserir(Veiculo t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO veiculo (modelo, marca, cor, assentos, placa)"
                    + " VALUES (?,?,?,?,?)";
            String curral = "SELECT currval('veiculo_id_seq');";
            this.inserir_alterar(t, con, sql, curral);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql =  "DELETE FROM veiculo"
                    + "WHERE id =  ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (int) object[0]);
            ps.execute();

            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public void alterar(Veiculo t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE veiculo SET"
                    + "modelo = ? ,"
                    + "marca = ? ,"
                    + "cor = ? ,"
                    + "assentos = ? ,"
                    + "placa = ?"                    
                    + "WHERE id = ?;";
            this.inserir_alterar(t, con, sql);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public Veiculo visualizarUm(Object... object) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            List<Veiculo> lista = new ArrayList<>();
            String condicao = "AND id = ";
            lista = this.visualizar(con, "veiculo", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Veiculo> visualizarAll() throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "veiculo", "");
        } catch (Exception e) {
            return null;
        }
    }

}
