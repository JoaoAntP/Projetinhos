package praticando.POO;

public class ProgramaPrincipal {
    public static void main(String[]args){

        //Criar uma pessoa => instanciar(new)
        //Sintaxe para cria qualquer objeto - tipo(classe) var = new classe()

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(19);
        pessoa1.setAltura(1.75);
        pessoa1.setPeso(69.8);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());
        System.out.println(pessoa1.getPeso());

        Pessoa pessoa2 = new Pessoa("Maria", 24, 1.58, 56);

        System.out.println(pessoa2.getNome());

        System.out.println(pessoa2.calcularImc());
        System.out.println(pessoa2.classificacaoDeImc());
        System.out.println(pessoa2.apresentar());

    }
}
