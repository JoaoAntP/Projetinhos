import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        boolean empregado = false;
        boolean respostaValida = false;

        while (!respostaValida) {
            System.out.print("Digite se você está empregado (sim/não): ");
            String resposta = scanner.nextLine();

            if (resposta.equals("sim")) {
                empregado = true;
                respostaValida = true;
            } else if (resposta.equals("não")) {
                empregado = false;
                respostaValida = true;
            } else{
                System.out.println("Resposta inválida! Digite apenas 'sim' ou 'não'.");
            }
        }
        System.out.println("\n --- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Empregado: " + empregado);
        System.out.println("olá, sou " + nome + " tenho " + idade + " anos");

    }
}
