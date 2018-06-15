package model;

import interfaces.IDesmaterializar;
import interfaces.IModel;
import java.util.Date;
import util.Ultilidades;

public class Viagem implements IDesmaterializar, IModel{
    //Atributos
    private int id;
    private Date dataHoraSaida;
    private Date dataHoraChegada;
    private double valorViagem;
    private String comentarioMotorista;
    private String comentarioPassageiro;
    private String formapagamento;
    private Endereco saida;
    private Endereco destino;
    private Passageiro passageiro;
    private Motorista motorista;

    //construtor
    public Viagem() {}
    public Viagem(int id, Date dataHoraSaida, Date dataHoraChegada, double valorViagem, String comentarioMotorista, String comentarioPassageiro, String formapagamento, Endereco saida, Endereco destino, Passageiro passageiro, Motorista motorista) {
        this.id = id;
        this.dataHoraSaida = dataHoraSaida;
        this.dataHoraChegada = dataHoraChegada;
        this.valorViagem = valorViagem;
        this.comentarioMotorista = comentarioMotorista;
        this.comentarioPassageiro = comentarioPassageiro;
        this.formapagamento = formapagamento;
        this.saida = saida;
        this.destino = destino;
        this.passageiro = passageiro;
        this.motorista = motorista;
    }
    public Viagem(Viagem viagem) {
        this.id = viagem.id;
        this.dataHoraSaida = viagem.dataHoraSaida;
        this.dataHoraChegada = viagem.dataHoraChegada;
        this.valorViagem = viagem.valorViagem;
        this.comentarioMotorista = viagem.comentarioMotorista;
        this.comentarioPassageiro = viagem.comentarioPassageiro;
        this.formapagamento = viagem.formapagamento;
        this.saida = viagem.saida;
        this.destino = viagem.destino;
        this.passageiro = viagem.passageiro;
        this.motorista = viagem.motorista;
    }
    
    //Metodos
    @Override
    public String[] desmaterializar() {
        String[] linha = new String[58];
        
        linha[0] = id + "";
        linha[1] = passageiro.getNome();
        linha[2] = motorista.getNome();
        
        return linha;
    }
    
    public String[] desmaterializarTudo() {
        String[] linha = new String[58];
        
        linha[0] = id + "";
        linha[1] = Ultilidades.pegaDataDevolveString(dataHoraSaida);
        linha[2] = Ultilidades.pegaDataDevolveString(dataHoraChegada);
        linha[3] = valorViagem + "";
        linha[4] = comentarioMotorista;
        linha[5] = comentarioPassageiro;
        linha[6] = formapagamento;
        String[] ender = saida.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 6] = ender[i];
        }
        ender = saida.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 13] = ender[i];
        }
        ender = passageiro.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 20] = ender[i];
        }
        ender = motorista.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 36] = ender[i];
        }
        return linha;
    }
    
    //Getters AND Setters
    @Override
    public int getId() {
        return id;
    }
    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }
    public Date getDataHoraChegada() {
        return dataHoraChegada;
    }
    public double getValorViagem() {
        return valorViagem;
    }
    public String getComentarioMotorista() {
        return comentarioMotorista;
    }
    public String getComentarioPassageiro() {
        return comentarioPassageiro;
    }
    public String getFormapagamento() {
        return formapagamento;
    }
    public Endereco getSaida() {
        return saida;
    }
    public Endereco getDestino() {
        return destino;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
    public void setDataHoraChegada(Date dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }
    public void setComentarioMotorista(String comentarioMotorista) {
        this.comentarioMotorista = comentarioMotorista;
    }
    public void setComentarioPassageiro(String comentarioPassageiro) {
        this.comentarioPassageiro = comentarioPassageiro;
    }
    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
    public void setSaida(Endereco saida) {
        this.saida = saida;
    }
    public void setDestino(Endereco destino) {
        this.destino = destino;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
