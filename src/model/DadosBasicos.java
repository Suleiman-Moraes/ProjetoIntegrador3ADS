package model;

import enuns.Sexo;
import interfaces.IDesmaterializar;
import interfaces.IModel;
import java.util.Date;
import util.Ultilidades;

public abstract class DadosBasicos implements IDesmaterializar, IModel{
    //Atributos
    protected int id;
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String login;
    protected String senha;
    protected Date dataDeNascimento;
    protected Endereco endereco;
    protected Sexo sexo;
    
    //Construtor
    public DadosBasicos() {}
    public DadosBasicos(int id, String nome, String cpf, String telefone, String email, String login, String senha, Date dataDeNascimento, Endereco endereco, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    public DadosBasicos(DadosBasicos objeto) {
        this.id = objeto.id;
        this.nome = objeto.nome;
        this.cpf = objeto.cpf;
        this.telefone = objeto.telefone;
        this.email = objeto.email;
        this.login = objeto.login;
        this.senha = objeto.senha;
        this.dataDeNascimento = objeto.dataDeNascimento;
        this.endereco = objeto.endereco;
        this.sexo = objeto.sexo;
    }
    
    //Metodos
    protected String[] desmaterializar(int lengh) {
        String[] linha = new String[lengh];
        
        linha[0] = this.id + "";
        linha[1] = this.nome;
        linha[2] = this.cpf;
        linha[3] = this.telefone;
        linha[4] = this.email;
        linha[5] = this.login;
        linha[6] = this.senha;
        linha[7] = Ultilidades.pegaDataDevolveString(this.dataDeNascimento);
        String[] ender = endereco.desmaterializar();
        for (int i = 1; i < ender.length; i++) {
            linha[i + 7] = ender[i];
        }
        linha[14] = sexo.getDescricao();
        return linha;
    }
    
    //Getters And Setters
    @Override
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Sexo getSexo() {
        return sexo;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
