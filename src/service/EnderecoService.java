package service;

import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import model.Endereco;
import persistencia.EnderecoDao;

public class EnderecoService implements ICrudService<Endereco>{

    @Override
    public void salvar(Endereco t) throws Exception {
        if(!ValidacaoComum.validaCep(t.getCep())){
            throw new Exception("CEP Inválido.");
        }
        if(t.getId() != 0){
            new EnderecoDao().alterar(t);
        }
        else{
            new EnderecoDao().inserir(t);
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new EnderecoDao().deletar(object);
    }

    @Override
    public Endereco visualizarUm(Object... object) throws SQLException {
        return new EnderecoDao().visualizarUm(object);
    }

    @Override
    public Iterator<Endereco> visualizarAll() throws SQLException {
        return new EnderecoDao().visualizarAll().iterator();
    }
}
