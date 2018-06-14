package service;

import enuns.StatusMotorista;
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
    
    public Iterator<Motorista> bucarPassageirosPassandoStatusEnum(StatusMotorista statusMotorista) throws SQLException {
        try {
            String condicao = " AND status_motorista = ";
            condicao += statusMotorista.getDescricao();
            return new MotoristaDao().bucarMotoristasPassandoParametros(condicao).iterator();
        } catch (Exception e) {
            return null;
        }
    }
}
