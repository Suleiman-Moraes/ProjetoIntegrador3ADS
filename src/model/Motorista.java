package model;

import enuns.Sexo;
import enuns.StatusMotorista;
import java.util.Date;

public class Motorista extends DadosBasicos{
    //Atributos
    private String cnh;
    private StatusMotorista statusMotorista;
    private Veiculo veiculo;

    //Construtor
    public Motorista() {}
    public Motorista(int id, String nome, String cpf, String telefone, String email, String login, String senha, Date dataDeNascimento, Endereco endereco, Sexo sexo, String cnh, StatusMotorista statusMotorista, Veiculo veiculo) {
        super(id, nome, cpf, telefone, email, login, senha, dataDeNascimento, endereco, sexo);
        this.cnh = cnh;
        this.statusMotorista = statusMotorista;
        this.veiculo = veiculo;
    }
    
    public Motorista(Motorista objeto) {
        super(objeto);
        this.cnh = objeto.cnh;
        this.statusMotorista = objeto.statusMotorista;
        this.veiculo = objeto.veiculo;
    }
    
    //Metodos
    @Override
    public String[] desmaterializar() {
        String[] linha = this.desmaterializar(22);
        
        linha[15] = cnh;
        linha[16] = statusMotorista.getDescricao();
        String[] ender = veiculo.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 16] = ender[i];
        }
        return linha;
    }
    
    //Getters And Setters
    public String getCnh() {
        return cnh;
    }
    public StatusMotorista getStatusMotorista() {
        return statusMotorista;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public void setStatusMotorista(StatusMotorista statusMotorista) {
        this.statusMotorista = statusMotorista;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
