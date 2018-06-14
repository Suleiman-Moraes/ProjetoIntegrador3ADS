package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import util.Conexao;

public class EnderecoDao extends GenericDao<Endereco>{

    @Override
    protected Endereco devolverObjeto(ResultSet rs) throws SQLException {
        while (rs.next()) {
            return new Endereco(rs.getInt("id"), rs.getString("rua"), rs.getString("quadra"), 
                    rs.getString("lote"), rs.getString("setor"), rs.getString("cep"), rs.getString("complemento"));//Incompleto
        }
        return null;
    }

    @Override
    protected PreparedStatement prepararParaInserir_alterar(Endereco t, Connection con, String sql) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getRua());
            ps.setString(2, t.getQuadra());
            ps.setString(3, t.getLote());
            ps.setString(4, t.getSetor());
            ps.setString(5, t.getCep());
            ps.setString(6, t.getComplemento());

            if(t.getId() > 0){
                ps.setInt(7, t.getId());
            }
            
            return ps;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void inserir(Endereco t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO endereco(rua, quadra, lote, setor, cep, complemento)"
                    + " VALUES (?,?,?,?,?,?)";
            
            String curral = "SELECT currval('endereco_id_seq') as id;";
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
            String sql = "DELETE FROM endereco"
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
    public void alterar(Endereco t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE endereco SET"
                    + "rua = ? ,"
                    + "quadra = ? ,"
                    + "lote = ? ,"
                    + "setor = ? ,"
                    + "cep = ? ,"
                    + "complemento = ?"
                    + "WHERE id = ?;";
            this.inserir_alterar(t, con, sql);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public Endereco visualizarUm(Object... object) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            List<Endereco> lista = new ArrayList<>();
            String condicao = "AND id = ";//haha vai ter q concatenar na mão kkk
            lista = this.visualizar(con, "endereco", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Endereco> visualizarAll() throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "endereco", "");
        } catch (Exception e) {
            return null;
        }
    }
    
}
