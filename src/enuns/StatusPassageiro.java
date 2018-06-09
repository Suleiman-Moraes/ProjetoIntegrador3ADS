package enuns;
public enum StatusPassageiro {
    ONLINE("ONLINE"),
    OFFLINE("OFFLINE"),
    EM_VIAGEM("EM VIAGEM"),
    SOLICITOU_VIAGEM("SOLICITOU VIAGEM");
    
    private String descricao;

    private StatusPassageiro(String descricao) {
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
