package HerancaePolimorfismo.domain;

public sealed abstract class Employee permits Menager, Salesman {

    protected String code;

    protected String name;

    protected String address;

    protected int age;

    protected double salary;

    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name ;
        this.address = address ;
        this.age = age ;
        this.salary = salary ;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getFullSalary();

}
