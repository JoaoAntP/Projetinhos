package md_exer02;

import java.util.Scanner;

public class produtos {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int num = 0;

        while (num != 4){
            System.out.println("""
                    
                    1-Álcool
                    2-Gasolina
                    3-Diesel
                    """);
            num = scanner.nextInt();
            if(num == 1){
                alcool = alcool+1;
            } else if (num == 2) {
                gasolina = gasolina+1;
            } else if (num == 3){
                diesel = diesel+1;
            }else{
                System.out.println("Digite um código válido");
            }
            System.out.println("Muito Obrigado");
            System.out.println("Alcool: "+alcool);
            System.out.println("Gasolina: "+gasolina);
            System.out.println("Disel: "+ diesel);
        }

       scanner.close();
    }
}
