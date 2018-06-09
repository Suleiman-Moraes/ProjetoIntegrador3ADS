package interfaces;
public interface IServidorObserver {
    void incluirNaRede(IObservador cv);
    void retirarDaRede(IObservador cv);
    void dispararInformacoes();
    void setInformacao(IObservador cv);
}
