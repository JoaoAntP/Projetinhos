package DesafiosClasse_Encapsulamento.d3;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinadeLavarPet MaquinadeLavarPet = new MaquinadeLavarPet();

    public static void main(String[] args) {
        var option = -2;
        do {
            System.out.println("===Escolha uma das opções a seguir");
            System.out.println("================================");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer Máquina com Água");
            System.out.println("3 - Abastecer Máquina com Shampoo");
            System.out.println("4 - Verificar Água da Máquina ");
            System.out.println("5 - Verificar Shampoo da Máquina  ");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar Pet da maquia");
            System.out.println("9 - Limpar Maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> MaquinadeLavarPet.takeashowerinPet();
                case 2 -> setAgua();
                case 3 -> setShampoo(); // Chamando o método certo agora
                case 4 -> verificaAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificarsehaPet();
                case 7 -> setMaquinadeLavarPet();
                case 8 -> MaquinadeLavarPet.removerPet();
                case 9 -> MaquinadeLavarPet.banho();
            }
        } while (option != 0);
    }

    public static void setAgua(){
        System.out.println("Tentando colocar agua na máquina");
        // CHAMEI O RESERVATORIO para aparecer sua mensagem de "limite atingido"
        MaquinadeLavarPet.reservatorioAgua();
    }

    public static void setShampoo(){
        System.out.println("Tentando colocar Shampoo na máquina");
        // CHAMEI O RESERVATORIO para aparecer sua mensagem de "limite atingido"
        MaquinadeLavarPet.reservatorioShampoo();
    }

    private static void verificaAgua() {
        var amout = MaquinadeLavarPet.getAgua();
        System.out.println("No momento a máqunia esta com"+amout+"litro(s) de Shapoom no momento");
    }

    private static void verificarShampoo() {
        var amout = MaquinadeLavarPet.getShampoo();
        System.out.println("No momento a máqunia esta com"+amout+"litro(s) de Shapoom no momento");
    }

    private static void verificarsehaPet() {
        var temPet = MaquinadeLavarPet.temPet();
        System.out.println(temPet?"Tem pet na máquina" : "Não tem Pet na Máquina");
    }

    public static void setMaquinadeLavarPet(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        MaquinadeLavarPet.setPet(pet);
        System.out.println("O pet"+ pet.getName()+"foi colocado na máquina");
    }
}