package DesafiosClasse_Encapsulamento.d3;
//Define a classe Pet
public class Pet {
    private String name;

    private boolean clean;

    public Pet( String name){
        this.name = name;
        this.clean = false;
    }
//Pega e retorna o valor name
    public String getName() {
        return name;
    }


    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
