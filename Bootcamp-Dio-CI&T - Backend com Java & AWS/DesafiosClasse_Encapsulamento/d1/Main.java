package DesafiosClasse_Encapsulamento.d1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Crie uma conta abaixo: ");

        System.out.println("Quanto você deseja depositar ?");
        double Inisaldo = scan.nextDouble();

        System.out.println("Consultar saldo");
        System.out.println("consultar cheque especial");
        System.out.println("Depositar dinheiro");
        System.out.println("Sacar dinheiro");
        System.out.println("Pagar um boleto");
        System.out.println("Verificar se a conta está usando cheque especial");


        int opc = scan.nextInt();

        if(opc == 1){
            System.out.println("Seu saldo Atual é"+ Inisaldo);
        }else if(opc == 2){
            System.out.println("consultar cheque especial");
        }else if(opc == 3){
            System.out.println("Depositar dinheiro");
        }else if(opc == 4){
            System.out.println("Sacar dinheiro");
        }else if(opc == 5){
            System.out.println("Pagar um boleto");
        }else if(opc == 6){
            System.out.println("Verificar se a conta está usando cheque especial");
        }else{
            System.out.println("Opção Inválida");
        }















    }

}
