package model;

import enuns.Sexo;
import enuns.StatusPassageiro;
import java.util.Date;

public class Passageiro extends DadosBasicos{
    //Atributos
    private StatusPassageiro statusPassageiro;
    
    //Construtor
    public Passageiro() {}
    public Passageiro(Passageiro objeto) {
        super(objeto);
        this.statusPassageiro = objeto.statusPassageiro;
    }
    public Passageiro(int id, String nome, String cpf, String telefone, String email, String login, String senha, Date dataDeNascimento, Endereco endereco, Sexo sexo, StatusPassageiro statusPassageiro) {
        super(id, nome, cpf, telefone, email, login, senha, dataDeNascimento, endereco, sexo);
        this.statusPassageiro = statusPassageiro;
    }
    
    //Metodos
    @Override
    public String[] desmaterializar() {
        String[] linha = this.desmaterializar(17);
        
        linha[16] = statusPassageiro.getDescricao();
        return linha;
    }
    
    //Getters And Setters
    public StatusPassageiro getStatusPassageiro() {
        return statusPassageiro;
    }
    public void setStatusPassageiro(StatusPassageiro statusPassageiro) {
        this.statusPassageiro = statusPassageiro;
    }
}
