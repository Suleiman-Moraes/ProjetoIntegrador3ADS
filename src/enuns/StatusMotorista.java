package enuns;
public enum StatusMotorista {
    ONLINE("ONLINE"),
    OFFLINE("OFFLINE"),
    EM_VIAGEM("EM VIAGEM");
    
    private String descricao;

    private StatusMotorista(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
