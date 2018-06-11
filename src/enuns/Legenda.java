package enuns;
public enum Legenda {
    PASSAGEIRO("CadastroModelo", "Visualização de Modelo", "Modelo", "apresentacao.cadastro.", "persistencia.ModeloDao");
    
    private String classe;
    private String tituloGrid;
    private String nomeGrid;
    private String pacote;
    private String service;

    private Legenda(String classe, String tituloGrid, String nomeGrid, String pacote, String service) {
        this.classe = classe;
        this.tituloGrid = tituloGrid;
        this.nomeGrid = nomeGrid;
        this.pacote = pacote;
        this.service = service;
    }

    public String getClasse() {
        return classe;
    }

    public String getTituloGrid() {
        return tituloGrid;
    }

    public String getNomeGrid() {
        return nomeGrid;
    }

    public String getPacote() {
        return pacote;
    }

    public String getService() {
        return service;
    }
}
