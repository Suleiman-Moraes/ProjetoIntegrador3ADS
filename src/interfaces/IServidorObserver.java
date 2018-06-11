package interfaces;

import observer.Informacao;

public interface IServidorObserver {
    void incluirNaRede(IObservador cv);
    void retirarDaRede(IObservador cv);
    void dispararInformacoes();
    void setInformacao(Informacao cv);
}
