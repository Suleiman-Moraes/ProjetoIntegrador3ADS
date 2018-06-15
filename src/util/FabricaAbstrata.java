package util;

import interfaces.BuscarPassandoLoginSenha;

public abstract class FabricaAbstrata {
    
//    public static Object[] getInstance(Legenda legenda) throws Exception{
//        switch(enun.toUpperCase()){
//            case "STATUSMOTORISTA":
//                return StatusMotorista.values();
//            case "STATUSPASSAGEIRO":
//                return StatusPassageiro.values();
//            default:
//                return null;
//        }
//    }
    
    public abstract BuscarPassandoLoginSenha getInstance()throws Exception;
}
