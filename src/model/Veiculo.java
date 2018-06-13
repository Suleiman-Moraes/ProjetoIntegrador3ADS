package model;

import interfaces.IDesmaterializar;
import interfaces.IModel;

public class Veiculo implements IDesmaterializar, IModel{

    //Atributos
    private int id;
    private String modelo;
    private String marca;
    private String cor;
    private int assentos;
    private String placa;

    //Construtor
    public Veiculo() {}
    public Veiculo(int id, String modelo, String marca, String cor, int assentos, String placa) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.assentos = assentos;
        this.placa = placa;
    }
    public Veiculo(Veiculo objeto) {
        this.id = objeto.id;
        this.modelo = objeto.modelo;
        this.marca = objeto.marca;
        this.cor = objeto.cor;
        this.assentos = objeto.assentos;
        this.placa = objeto.placa;
    }

    //Metodos
    @Override
    public String[] desmaterializar() {
        String[] linha = new String[6];

        linha[0] = this.getId() + "";
        linha[1] = this.getModelo();
        linha[2] = this.getMarca();
        linha[3] = this.getCor();
        linha[4] = this.getAssentos() + "";
        linha[5] = this.getPlaca();
        return (linha);

    }

    @Override
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAssentos() {
        return assentos;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
