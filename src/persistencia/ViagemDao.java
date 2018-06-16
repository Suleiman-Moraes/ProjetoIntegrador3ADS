package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Viagem;
import util.Conexao;
import util.Ultilidades;

public class ViagemDao extends GenericDao<Viagem> {

    @Override
    protected Viagem devolverObjeto(ResultSet rs) throws SQLException {
        return new Viagem(rs.getInt("id"),
                Ultilidades.pegaDataDevolveData(rs.getDate("data_hora_saida")),
                Ultilidades.pegaDataDevolveData(rs.getDate("data_hora_chegada")),
                new Double(rs.getString("valor_viagem")),
                rs.getString("comentario_motorista"),
                rs.getString("comentario_passageiro"),
                rs.getString("forma_pagamento"),
                new  EnderecoDao().visualizarUm(rs.getInt("id_saida")), 
                new  EnderecoDao().visualizarUm(rs.getInt("id_destino")), 
                new  PassageiroDao().visualizarUm(rs.getInt("id_passageiro")), 
                new  MotoristaDao().visualizarUm(rs.getInt("id_motorista")));
              
    }
    

    @Override
    protected PreparedStatement prepararParaInserir_alterar(Viagem t, Connection con, String sql) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) t.getDataHoraSaida());
            ps.setDate(2, (Date) t.getDataHoraChegada());
            ps.setString(3, t.getValorViagem() + "");
            ps.setString(4, t.getComentarioMotorista());
            ps.setString(5, t.getComentarioPassageiro());
            ps.setString(6, t.getFormapagamento());
            ps.setInt(7, t.getSaida().getId());
            ps.setInt(8, t.getDestino().getId());
            ps.setInt(9, t.getPassageiro().getId());
            ps.setInt(10, t.getMotorista().getId());

            if (t.getId() > 0) {
                ps.setInt(11, t.getId());
            }

            return ps;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void inserir(Viagem t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO viagem (id, data_hora_saida, data_hora_chegada, valor_viagem, comentario_motorista,  comentario_passageiro, forma_pagamento, id_saida , id_destino, id_passageiro, id_motorista)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            String curral = "SELECT currval('viagem_id_seq');";
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
            String sql = "DELETE FROM viagem"
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
    public void alterar(Viagem t) throws SQLException {
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE viagem SET"
                    + " id = ? ,"
                    + " data_hora_saida = ? ,"
                    + " data_hora_chegada = ? ,"
                    + " comentario_motorista = ? ,"
                    + " forma_pagamento = ? ,"
                    + " comentario_passageiro = ? ,"
                    + " valor_viagem = ? ,"
                    + " id_saida = ? ,"
                    + " id_destino = ? ,"
                    + " id_passageiro = ?"
                    + " id_motorista = ?"
                    + " WHERE id = ?;";
            this.inserir_alterar(t, con, sql);
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
        }
    }

    @Override
    public Viagem visualizarUm(Object... object) throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            List<Viagem> lista = new ArrayList<>();
            String condicao = " AND id = ";
            condicao += (int) object[0];//haha vai ter q concatenar na mão kkk
            lista = this.visualizar(con, "viagem", condicao);
            return lista.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Viagem> visualizarAll() throws SQLException {
        try {
            Connection con = util.Conexao.getConexao();
            return this.visualizar(con, "viagem", "");
        } catch (Exception e) {
            return null;
        }
    }
}