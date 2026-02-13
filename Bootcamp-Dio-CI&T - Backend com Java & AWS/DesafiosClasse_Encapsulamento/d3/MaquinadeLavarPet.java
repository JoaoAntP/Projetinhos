package DesafiosClasse_Encapsulamento.d3;

public class MaquinadeLavarPet {

    private boolean clean = true;
    private int agua = 30;
    private int shampoo = 10;
    private Pet pet = null;

    public void takeashowerinPet(){
        if(this.pet == null){
            System.out.println("Coloque um pet na maquina para iniciar o banho");
            return;
        }
        this.agua -=10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println(" O pet"+ pet.getName()+"está limpo");
    }

    public void reservatorioAgua() {
        if (this.agua == 30) {
            System.out.println("O limite de litros de agua foi atingido");
            return;
        }
        agua += 2;
    }

    public void reservatorioShampoo(){
        if(this.shampoo == 10){
            // Mantida sua frase original que diz "agua" no shampoo
            System.out.println("O limite de litros de agua foi atingido");
            return;
        }
        shampoo += 2;
    }

    public int getAgua() { return agua; }
    public int getShampoo() { return shampoo; }
    public boolean temPet(){ return pet != null; }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar outro pet e necessário limpar");
            return;
        }
        // CONSERTO: Removi o "!" para que ele te mostre a mensagem quando o pet JÁ ESTÁ lá
        if (temPet()){
            System.out.println("O pet"+this.pet.getName()+"está na máquina nesse momento");
            return;
        }
        this.pet = pet;
    }

    public void removerPet(){
        if (this.pet == null) return;
        this.clean = this.pet.isClean();
        System.out.println("O pet"+ this.pet.getName()+"está limpo");
        this.pet = null;
    }

    public void banho(){
        this.agua -=10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}