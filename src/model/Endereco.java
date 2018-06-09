package model;

import interfaces.IDesmaterializar;
import interfaces.IModel;

public class Endereco implements IDesmaterializar, IModel{
    //Atributos
    private int id;
    private String rua;
    private String quadra;
    private String lote;
    private String setor;
    private String cep;
    private String complemento;
    
    //Construtor
    public Endereco() {}
    public Endereco(int id, String rua, String quadra, String lote, String setor, String cep, String complemento) {
        this.id = id;
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
        this.setor = setor;
        this.cep = cep;
        this.complemento = complemento;
    }
    public Endereco(Endereco objeto) {
        this.id = objeto.id;
        this.rua = objeto.rua;
        this.quadra = objeto.quadra;
        this.lote = objeto.lote;
        this.setor = objeto.setor;
        this.cep = objeto.cep;
        this.complemento = objeto.complemento;
    }
    
    //Metodos

    @Override
    public String[] desmaterializar() {
        String[] linha = new String[7];
        
        linha[0] = this.id + "";
        linha[1] = this.rua;
        linha[2] = this.quadra;
        linha[3] = this.lote;
        linha[4] = this.setor;
        linha[5] = this.cep;
        linha[6] = this.complemento;
        return linha;
    }    
    
    //Getters And Setters
    @Override
    public int getId() {
        return id;
    }
    public String getRua() {
        return rua;
    }
    public String getQuadra() {
        return quadra;
    }
    public String getLote() {
        return lote;
    }
    public String getSetor() {
        return setor;
    }
    public String getCep() {
        return cep;
    }
    public String getComplemento() {
        return complemento;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
