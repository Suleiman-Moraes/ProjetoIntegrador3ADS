package model;

import enuns.Sexo;
import enuns.StatusMotorista;
import java.util.Date;

public class Motorista extends DadosBasicos{
    //Atributos
    private String cnh;
    private StatusMotorista statusMotorista;

    //Construtor
    public Motorista() {}
    public Motorista(int id, String nome, String cpf, String telefone, String email, String login, String senha, Date dataDeNascimento, Endereco endereco, Sexo sexo, String cnh, StatusMotorista statusMotorista) {
        super(id, nome, cpf, telefone, email, login, senha, dataDeNascimento, endereco, sexo);
        this.cnh = cnh;
        this.statusMotorista = statusMotorista;
    }
    public Motorista(Motorista objeto) {
        super(objeto);
        this.cnh = objeto.cnh;
        this.statusMotorista = objeto.statusMotorista;
    }
    
    //Metodos
    @Override
    public String[] desmaterializar() {
        String[] linha = this.desmaterializar(18);
        
        linha[16] = cnh;
        linha[17] = statusMotorista.getDescricao();
        return linha;
    }
    
    //Getters And Setters
    public String getCnh() {
        return cnh;
    }
    public StatusMotorista getStatusMotorista() {
        return statusMotorista;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public void setStatusMotorista(StatusMotorista statusMotorista) {
        this.statusMotorista = statusMotorista;
    }
}
