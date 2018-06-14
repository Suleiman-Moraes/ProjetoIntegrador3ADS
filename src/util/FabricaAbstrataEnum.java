package util;

import enuns.StatusMotorista;
import enuns.StatusPassageiro;

public abstract class FabricaAbstrataEnum {
    
    public static Object[] getInstance(String enun) throws Exception{
        switch(enun.toUpperCase()){
            case "STATUSMOTORISTA":
                return StatusMotorista.values();
            case "STATUSPASSAGEIRO":
                return StatusPassageiro.values();
            default:
                return null;
        }
    }
}
