package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import model.Motorista;
import persistencia.MotoristaDao;

public class MotoristaService implements ICrudService<Motorista>{

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
}
