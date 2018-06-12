package util;

import apresentacao.passageiro.PassageiroCadastro;
import enuns.Legenda;
import javax.swing.JDesktopPane;

public class Fabrica {
    public static Object getInstance(Object[] vet, String descricao){
        for (Object x : vet) {
            if(descricao.equals(x.toString())){
                return x;
            }
        }
        return null;
    }
    
    public static Object getInstance(Legenda legenda, JDesktopPane pane){
        switch(legenda){
            case PASSAGEIRO:
                return new PassageiroCadastro(legenda, pane);
            default:
                return null;
        }
    }
}
