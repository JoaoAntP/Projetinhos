package ex_aula;

import java.util.Scanner;

public class while_1 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qualquer numero: ");

        int x = scanner.nextInt();
        int soma = 0;

        while (x!=0){
            soma = soma + x;
            x = scanner.nextInt();
        }

        System.out.println("A soma total foi :" + soma);

        scanner.close();
    }
}
