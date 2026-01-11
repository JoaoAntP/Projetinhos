package praticando;

public class repetição_java_HDC {
    public static void main(String[]args){
        int contador = 1;

        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }
            //Se não tiver uma condição para o fim do loop ele vira rodando eternamente
        for(int i = 1;i<=5;i++){
            System.out.println("O valor de i é "+i);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        int somaPar = 0;
        int somaImpar = 0;

        for(int num : numeros){
            if(num% 2==0){
                somaPar += num;
            } else {
                somaImpar +=num;
            }
            if(num% 3==0){
                System.out.println("O número " +num+" e multiplo de 3");
            }
            if (num>5&& num<7){
                System.out.println("O número "+num+" esta em entre 5 e 7");
            }
        }
        System.out.println("A soma pares "+ somaPar);
        System.out.println("Soma Impares " + somaImpar);

        //break => ejetar o loop
        // continue => pular uma execução

        //vars temporarios dos loops, elas podem repetir o nome
        for(int i = 1; i <= 10; i++){

            if(i == 2){
                continue;
            }
            if(i == 5){
                break;
            }

            System.out.println(i);
        }
    }
}
