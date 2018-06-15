package interfaces;

import java.sql.SQLException;
import java.util.List;

public interface BuscarPassandoLoginSenha<T> {
    List<T> buscarPassandoLoginSenha(String login, String senha) throws SQLException;

}
