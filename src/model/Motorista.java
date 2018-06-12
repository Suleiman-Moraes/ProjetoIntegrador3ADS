package model;

import enuns.Sexo;
import enuns.StatusMotorista;
import enuns.StatusPassageiro;
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

    public Motorista(int aInt, String string, String string0, String string1, String string2, String string3, String string4, Date pegaDataDevolveData, String string5, Sexo sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Motorista(int aInt, String string, String string0, String string1, String string2, String string3, String string4, Date pegaDataDevolveData, Endereco visualizarUm, Sexo sexo, StatusPassageiro statusPassageiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
