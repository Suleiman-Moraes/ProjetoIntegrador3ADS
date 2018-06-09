package persistencia;

import interfaces.ICrudDao;
import interfaces.IModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDao<T> implements ICrudDao<T>{
    protected void inserir_alterar(T t, Connection con, String ...sql) throws SQLException{
        try{
            PreparedStatement ps = prepararParaInserir_alterar(t, con, sql[0]);
            if(((IModel)t).getId() > 0){
                ps.executeUpdate();
            }
            else{
                ps.execute();
                if(sql.length > 1){
                    Statement sta = con.createStatement();
                    ResultSet rs = sta.executeQuery(sql[1]);
                    while(rs.next()){
                        ((IModel)t).setId(rs.getInt(1));
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }
    
    protected List<T> visualizar(Connection con, String nomeDaTabela, String... condicao) throws SQLException {
        StringBuffer sql = new StringBuffer("");
        sql.append("SELECT * FROM ");
        sql.append(nomeDaTabela);
        sql.append(" WHERE 1 = 1");
        if(condicao.length > 0){
            for (String x : condicao) {
                sql.append(x);
            }
        }
        PreparedStatement ps = con.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        List<T> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(devolverObjeto(rs));
        }
        return lista;
    }
    
    protected abstract T devolverObjeto(ResultSet rs) throws SQLException;
    
    protected abstract PreparedStatement prepararParaInserir_alterar(T t, Connection con, String sql) throws SQLException;
}
