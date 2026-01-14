public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 1.50;
        int totalDeDiasDoMEs = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valotTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDeDiasDoMEs;

        System.out.println("Valor total: R$" + valorTotalComDesconto);

    }
}
