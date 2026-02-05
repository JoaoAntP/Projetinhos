package testelogicaDIO;

import java.util.Scanner;

public class exercioimposto {
    public static void main(String[] args) {

        Scanner leitoDeEntrada = new Scanner(System.in);
        float valorSalario = leitoDeEntrada.nextFloat();
        float valorBeneficios = leitoDeEntrada.nextFloat();

        float valorImposto;
        if(valorSalario<= 1100){
            valorImposto = 0.05F * valorSalario;
        } else if ( valorSalario <=2500){
            valorImposto = 0.10F * valorSalario;
        }else{
            valorImposto = 0.15F * valorSalario;
        }

        float saida  = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f", saida);

        leitoDeEntrada.close();

    }

}
