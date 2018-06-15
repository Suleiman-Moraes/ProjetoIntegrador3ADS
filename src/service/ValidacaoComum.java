package service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.InputMismatchException;

public class ValidacaoComum {
    public static boolean validaCPF(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static boolean validaCNH(String cnh) {
        if (!cnh.matches("[0-9]")) {
            return false;
        }

        if (cnh.equals("11111111111") || cnh.equals("22222222222") || cnh.equals("33333333333")
                || cnh.equals("44444444444") || cnh.equals("55555555555") || cnh.equals("66666666666")
                || cnh.equals("77777777777") || cnh.equals("88888888888") || cnh.equals("99999999999")
                || cnh.equals("00000000000")) {
            return false;
        }

        int[] fracao = new int[9];
        int acumulador = 0;
        int inc = 2;
        for (int i = 0; i < 9; i++) {
            fracao[i] = (Math.abs(Integer.parseInt(cnh.substring(i, 1)))) * inc;
            acumulador += fracao[i];
            inc++;
        }

        int resto = acumulador % 11;
        int digito1 = 0;
        if (resto > 1) {
            digito1 = 11 - resto;
        }
        acumulador = digito1 * 2;
        inc = 3;
        for (int i = 0; i < 9; i++) {
            fracao[i] = (Math.abs(Integer.parseInt(cnh.substring(i, 1)))) * inc;
            acumulador += Math.abs(fracao[i]);
            inc++;
        }

        resto = acumulador % 11;
        int digito2 = 0;
        if (resto > 1) {
            digito2 = 11 - resto;
        }
        if (digito1 == Math.abs(Integer.parseInt(cnh.substring(9, 1)))
                && digito2 == Math.abs(Integer.parseInt(cnh.substring(10, 1)))) {
            return true;
        }

        return false;
    }
    
    public static boolean isDateValid(java.util.Date strDate) {
        String dateFormat = "dd/MM/uuuu";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String data = format.format(strDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern(dateFormat)
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(data, dateTimeFormatter);
            if (strDate.compareTo(new Date(System.currentTimeMillis())) > 0) {
                return true;
            }
            return false;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public static boolean isDateValid(String data) throws Exception {
        String dateFormat = "dd/MM/uuuu";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern(dateFormat)
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(data, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            throw new Exception("Data ivalida.");
        }
    }
    
    public static boolean validaCep(String cep){
        String padrao = "\\d{5}-\\d{3}";

        if (cep.matches(padrao)){
            return true;
        }else {
            return false;
        }
    }
}
