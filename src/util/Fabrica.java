package util;

public class Fabrica {
    public static Object getInstance(Object[] vet, String descricao){
        for (Object x : vet) {
            if(descricao.equals(x.toString())){
                return x;
            }
        }
        return null;
    }
}
