package md_exer02;

import java.util.Scanner;

public class quadrante {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite numero para o quadrante X: ");
        int x = scanner.nextInt();
        System.out.print("Digite numero para o quadrante Y: ");
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0)
                System.out.println("Quarto");

            System.out.print("Digite numero para o quadrante X: ");
            x = scanner.nextInt();
            System.out.print("Digite numero para o quadrante Y: ");
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
