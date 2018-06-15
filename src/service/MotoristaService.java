package service;

import enuns.StatusMotorista;
import interfaces.BuscarPassandoLoginSenha;
import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import model.Motorista;
import persistencia.MotoristaDao;

public class MotoristaService implements ICrudService<Motorista>, BuscarPassandoLoginSenha<Motorista>{

    @Override
    public void salvar(Motorista t) throws Exception {
        if(t.getId() != 0){
            new MotoristaDao().alterar(t);
        }
        else{
            new MotoristaDao().inserir(t);
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new MotoristaDao().deletar(object);
    }

    @Override
    public Motorista visualizarUm(Object... object) throws SQLException {
        return new MotoristaDao().visualizarUm(object);
    }

    @Override
    public Iterator<Motorista> visualizarAll() throws SQLException {
        return new MotoristaDao().visualizarAll().iterator();
    }
    
    public Iterator<Motorista> bucarMotoristasPassandoStatusEnum(StatusMotorista statusMotorista) throws SQLException {
        try {
            String condicao = " AND status_motorista = ";
            condicao += statusMotorista.getDescricao();
            return new MotoristaDao().bucarMotoristasPassandoParametros(condicao).iterator();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Motorista> buscarPassandoLoginSenha(String login, String senha) throws SQLException {
        try {
            StringBuilder tudo = new StringBuilder("");
            tudo.append(" AND login = ");
            tudo.append(login);
            tudo.append(" AND senha = ");
            tudo.append(senha);
            return new MotoristaDao().bucarMotoristasPassandoParametros(tudo.toString());
        } catch (Exception e) {
            return null;
        }
    }
}
