import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2");
        var resultado = scanner.nextInt();
        var isRight = resultado == 4;
        System.out.printf("O Resultado é 4, você acertou ? (%s)", isRight);
        System.out.println();


        var isWrong = resultado != 4;
        System.out.printf("O Resultado é 4, você errou ? (%s)", isWrong);
        System.out.println();

        System.out.println("Quanto anos você tem ? ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado ?");
        var isEmancipared = scanner.nextBoolean();

        var canDrive = age >= 18 || (isEmancipared && age >= 16);
        System.out.printf("Você pode dirigir ? (%s)", canDrive);

    }
}