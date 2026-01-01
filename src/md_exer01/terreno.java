package md_exer01;

import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura*comprimento;
        double preco = area * metroQuadrado;

        System.out.println("O valor de " + preco);
        System.out.println("A area foi de  " + area);

        sc.close();
    }
}
