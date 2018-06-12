package enuns;
public enum Legenda {
    PASSAGEIRO("PassageiroPrincipal", "Visualização de Passageiro", "Passageiro", "apresentacao.passageiro.", "persistencia.PassageiroDao", "service.PassageiroService");
    
    private String principal;
    private String tituloGrid;
    private String nomeGrid;
    private String caminhoPrincipal;
    private String dao;
    private String service;

    private Legenda(String principal, String tituloGrid, String nomeGrid, String caminhoPrincipal, String dao, String service) {
        this.principal = principal;
        this.tituloGrid = tituloGrid;
        this.nomeGrid = nomeGrid;
        this.caminhoPrincipal = caminhoPrincipal;
        this.dao = dao;
        this.service = service;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getTituloGrid() {
        return tituloGrid;
    }

    public String getNomeGrid() {
        return nomeGrid;
    }

    public String getCaminhoPrincipal() {
        return caminhoPrincipal;
    }

    public String getDao() {
        return dao;
    }

    public String getService() {
        return service;
    }
}
