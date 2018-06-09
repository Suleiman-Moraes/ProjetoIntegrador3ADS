package enuns;

public enum Sexo{
    HOMEM("Homem", 'H'),
    MULHER("Mulher", 'M');
    
    private String descricao;
    private char sigla;

    private Sexo(String descricao, char sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    public char getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
