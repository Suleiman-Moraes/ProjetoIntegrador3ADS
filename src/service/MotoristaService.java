package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import model.Passageiro;

public class MotoristaService implements ICrudService<Passageiro>{

    @Override
    public void salvar(Passageiro t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Passageiro visualizarUm(Object... object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Passageiro> visualizarAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
