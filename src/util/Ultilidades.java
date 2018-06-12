package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ultilidades {
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
    public static String pegaDataDevolveString(Date date){
        return format.format(date);
    }
    
    public static String pegaDataDevolveString(java.sql.Date date){
        return format.format(date);
    }
    
    public static Date pegaStringDevolveDataUtil(String date) throws ParseException{
        return format.parse(date);
    }
    
    public static Date pegaStringDevolveDataSQL(String date) throws ParseException{
        return pegaDataDevolveData(format.parse(date));
    }
    
    public static java.sql.Date pegaDataDevolveData(Date date){
        return new java.sql.Date(date.getTime());
    }
    
    public static Date pegaDataDevolveData(java.sql.Date date){
        return new Date(date.getTime());
    }
}
