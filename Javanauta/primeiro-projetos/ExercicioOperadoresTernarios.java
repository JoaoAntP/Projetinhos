public class ExercicioOperadoresTernarios {
    public static void main(String[] args) {

        int idade = 30;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        int numero = 15;
        String resultado1 = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado1);

        double nota = 5.5;
        String status = (nota >= 6) ? "Aprovado" : "Reprovado";
        System.out.println(status);

        String usuario = null;
        String exibicao = (usuario != null) ? usuario : "Usúario desconhecido";
        System.out.println(exibicao);

        double preco = 100.00;
        boolean temDesconto = true;
        double precoFinal = temDesconto ? preco * 0.9 : preco;
        System.out.println("Preço final: " + precoFinal);

        double notaEscola = 9.9;
        String resultado2 = (notaEscola >= 9) ? "Excelente, você foi aprovado!"
                            :(notaEscola >= 6) ? "Aprovado"
                            :"Reprovado";
        System.out.println(resultado2);
    }
}
