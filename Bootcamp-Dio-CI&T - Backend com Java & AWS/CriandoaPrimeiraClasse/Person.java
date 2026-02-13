package CriandoaPrimeiraClasse;

import java.time.OffsetDateTime;

public class Person {

    private String name;

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int lastYearAAgeInc = OffsetDateTime.now().getYear() -1;

    public void incAge(){
        if (this.lastYearAAgeInc >= OffsetDateTime.MAX.getYear()) return;
        this.age +=1;
        this.lastYearAAgeInc = OffsetDateTime.now().getYear();
    }
}
