public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Douglas";
        String nome2 = "Mathues";

       int tamanhoString = nome.length();
       boolean saoIguais = nome.equals(nome2);

        System.out.println("Olá " + nome + "," + " seu nome tem " + tamanhoString + " caracteres" + "!");
        System.out.println("Os nomes são iguais: " + saoIguais);
    }
}
