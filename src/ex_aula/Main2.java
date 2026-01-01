package ex_aula;

import java.util.Locale;

public class Main2 {

        public static void main(String[] args) {

            System.out.println("Ola mundo");
            System.out.println("Bom dia ");

            int y = 32;
            double x = 10.325548;

            System.out.println(x);
            System.out.println(y);

            //Para formatar deixando so duas casa decimais
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);

            //Trocar de Local em Java não esqueça do import
            Locale.setDefault(Locale.US);
            System.out.printf("%.4f%n", x);

            System.out.println("Resultado = " + x + " METROS");
            System.out.printf("Resultado = %.2f metros%n", x );


            //%f ponto flutuante, %d = int %s texto, %n = quebra de linha
            String nome = "Maria";
            int idade = 31;
            double renda = 4000.0;
            System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        }
    }