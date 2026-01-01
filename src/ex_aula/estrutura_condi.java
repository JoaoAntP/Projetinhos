package ex_aula;

import java.util.Scanner;

public class estrutura_condi {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que Horas são ? :");
        hora = sc.nextInt();

        if(hora < 12) {
            System.out.print("Bom dia!!!");
        }
        else {
            System.out.println("Boa Tarde!");
        }
        sc.close();
    }
}
