package HerancaePolimorfismo.domain;

public non-sealed class Salesman extends Employee {
    private  double porcentPerSold;

    private double soldAmout;

    public Salesman(String code, String name, String address, int age, double salary, double porcentPerSold, double soldAmout) {
        super(code, name, address, age, salary);
        this.porcentPerSold = porcentPerSold;
    }

    @Override
    public String getCode(){

        return "SL" + this.code;
    }

    @Override
    public double getFullSalary(){
        return this.salary + ((soldAmout*porcentPerSold)/100);
    }

    public Salesman() {
    }

    public double getPorcentPerSold() {
        return porcentPerSold;
    }

    public void setPorcentPerSold(final double porcentPerSold) {
        this.porcentPerSold = porcentPerSold;
    }

    public double getSoldAmout() {
        return soldAmout;
    }

    public void setSoldAmout(final double soldAmout) {
        this.soldAmout = soldAmout;
    }
}
