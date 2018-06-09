package interfaces;

import observer.Informacao;

public interface IObservador {
    void atualiza(Informacao informacao);
    void conversarComServidor(Object object);
}
