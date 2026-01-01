package md_exer02;

import java.util.Scanner;

public class while_ex01 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a senha: ");
        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = scanner.nextInt();
        }
        System.out.println("Senha Válida");
            scanner.close();

    }
}
