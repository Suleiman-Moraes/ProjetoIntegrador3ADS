package util;

import apresentacao.motorista.MotoristaCadastro;
import apresentacao.passageiro.PassageiroCadastro;
import enuns.Legenda;
import interfaces.BuscarPassandoLoginSenha;
import interfaces.IComunicaPaginaPrincipal;
import javax.swing.JDesktopPane;
import service.PassageiroService;

public class Fabrica {
    public static Object getInstance(Object[] vet, String descricao){
        for (Object x : vet) {
            if(descricao.equals(x.toString())){
                return x;
            }
        }
        return null;
    }
    
    
    
    public static Object getInstance(Legenda legenda, JDesktopPane pane, IComunicaPaginaPrincipal paginaPrincipal){
        switch(legenda){
            case PASSAGEIRO:
                return new PassageiroCadastro(legenda, pane, paginaPrincipal);
            case MOTORISTA:
                return new MotoristaCadastro(legenda, pane, paginaPrincipal);
            default:
                return null;
        }
    }
    
    public static BuscarPassandoLoginSenha getInstance(Legenda legenda)throws Exception{
        switch(legenda){
            case PASSAGEIRO:
                return new PassageiroService();
//            case MOTORISTA:
//                return new MotoristaCadastro(legenda, pane, paginaPrincipal);
            default:
                return null;
        }
    }
}
