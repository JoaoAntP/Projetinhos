package ex_aula;

import java.util.Scanner;

public class Scanner001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //double x;
        //x = sc.nextDouble();
        //System.out.println("Você digitou " + x);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou " + x);



        sc.close();
    }
}
