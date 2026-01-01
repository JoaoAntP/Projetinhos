package md_exer01;

import java.util.Locale;

public class _01_fixacao {
    public static void main(String[] args){

        String produto1 = "computador";
        String produto2 = "Notebook";

        int age = 30;
        int code = 5290;
        char genero = 'F';

        double preco1 = 2100.0 ;
        double preco2 = 650.50;
        double lalala = 53.234578;

        System.out.println("Produtos : " + produto1 + " O preço dele esta $ " + preco1+ " o preço do " + produto2 + " e de  $ " + preco2);

        System.out.println("Recorde " +age+" anos , o codigo "+ code +" and lalala de : "+ genero);

        System.out.println(" o valor total foi de " + lalala);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", lalala);


    }



}
