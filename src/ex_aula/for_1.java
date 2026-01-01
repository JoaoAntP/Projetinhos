package ex_aula;

import java.util.Scanner;

public class for_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite quantos números você deseja digitar: ");
        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i<N; i++){
            System.out.println("Digite algum número");
            int x = scanner.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
        scanner.close();
    }
}
