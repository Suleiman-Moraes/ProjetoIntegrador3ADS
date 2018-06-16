package service;

import enuns.StatusMotorista;
import interfaces.BuscarPassandoLoginSenha;
import interfaces.ICrudService;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import model.Motorista;
import persistencia.MotoristaDao;
import persistencia.VeiculoDao;

public class MotoristaService implements ICrudService<Motorista>, BuscarPassandoLoginSenha<Motorista> {

    @Override
    public void salvar(Motorista t) throws Exception {
        if(!ValidacaoComum.validaCPF(t.getCpf())){
            throw new Exception("CPF Inválido.");
        }
        if(!ValidacaoComum.isDateValid(t.getDataDeNascimento())){
            throw new Exception("Data de nascimento Inválida.");
        }
        if(!ValidacaoComum.validaCNH(t.getCnh())){
            throw new Exception("CNH Inválida.");
        }
        if(!ValidacaoComum.validaCep(t.getEndereco().getCep())){
            throw new Exception("CEP Inválido.");
        }
        if (t.getId() != 0) {
            new VeiculoDao().alterar(t.getVeiculo());
            new EnderecoService().salvar(t.getEndereco());
            new MotoristaDao().alterar(t);
        } else {
            List aux = this.buscarPassandoQualquerCoisa("login", t.getLogin());
            if(aux != null && aux.size() != 0){
                throw new Exception("Login Inválido.");
            }
            aux = this.buscarPassandoQualquerCoisa("cpf", t.getCpf());
            if(aux != null && aux.size() != 0){
                throw new Exception("CPF Inválido.");
            }
            aux = this.buscarPassandoQualquerCoisa("cnh", t.getCnh());
            if(aux != null && aux.size() != 0){
                throw new Exception("CNH Inválido.");
            }
            VeiculoDao vei = new VeiculoDao();
            aux = vei.bucarVeiculosPassandoParametros(" AND placa = '" + t.getVeiculo().getPlaca() + "'");
            if(aux != null && aux.size() != 0){
                throw new Exception("Placa Inválida.");
            }
            vei.inserir(t.getVeiculo());
            new EnderecoService().salvar(t.getEndereco());
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
            return new MotoristaDao().buscarMotoristasPassandoParametros(condicao).iterator();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Motorista> buscarPassandoLoginSenha(String login, String senha) throws SQLException {
        try {
            StringBuilder tudo = new StringBuilder("");
            tudo.append(" AND login = '");
            tudo.append(login);
            tudo.append("' AND senha = '");
            tudo.append(senha).append("'");
            return new MotoristaDao().buscarMotoristasPassandoParametros(tudo.toString());
        } catch (Exception e) {
            return null;
        }
    }

    public List<Motorista> buscarPassandoQualquerCoisa(String coluna, String param) throws SQLException {
        try {
            StringBuilder tudo = new StringBuilder("");
            tudo.append(" AND ").append(coluna).append(" = '");
            tudo.append(param);
            tudo.append("'");
            return new MotoristaDao().buscarMotoristasPassandoParametros(tudo.toString());
        } catch (Exception e) {
            return null;
        }
    }
}
