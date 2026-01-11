package praticando.Projeto_Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sca = new Scanner (System.in);

        //        System.out.println(->sout);
        // public static void main(String[] args)(->psvm)


        //Exibir todas as opções para o usuário
        // e pedir para ele escolher
        System.out.println();
        int opcao;

        do{

            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            opcao =sca.nextInt();

            if (opcao >= 1 && opcao <= 4){

                //Resgatar os números do usuário

                //Encontrar o resultado
                System.out.println("Digite o Primeiro Número");
                double num1 = sca.nextDouble();
                System.out.println("Digite o SegundO Número");
                double num2 = sca.nextDouble();

                double resultado = 0;

                boolean oprecaoValida =  true;
                //Mostrar o resultado

                switch (opcao){
                    case 1:
                        resultado = adiconar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if (num2!=0){
                            resultado = dividir(num1,num2);
                        }else {
                            System.out.println("Divisão por 0");
                            oprecaoValida = false;
                        }
                        break;
                }
                if(oprecaoValida) {
                    System.out.println(resultado);
                }
            } else if (opcao!= 0) {
                System.out.println("Opção Invalida");
            }


        }while (opcao !=0);

        System.out.println("Calculadora encerrada");
        sca.close();

    }

    public  static double adiconar(double a, double b){
        return a + b;
    }

    public  static double subtrair(double a, double b){
        return a - b;
    }

    public  static double multiplicar(double a, double b){
        return a * b;
    }
    public  static double dividir(double a, double b){
        return a/b;
    }
}
