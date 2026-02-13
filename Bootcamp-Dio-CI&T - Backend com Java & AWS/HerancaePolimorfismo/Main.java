package HerancaePolimorfismo;

import HerancaePolimorfismo.domain.Employee;
import HerancaePolimorfismo.domain.Menager;
import HerancaePolimorfismo.domain.Salesman;

public class Main {
    public static void main(String[] args) {
            printEmployee(new Menager());
            printEmployee(new Salesman());



    }

    public static void printEmployee(Employee employee){
        System.out.printf("=======%s========\n",employee.getClass().getCanonicalName());
        switch (employee){
            case Menager menager ->{
                employee.setCode("123");
                employee.setName("João");
                employee.setSalary(5000);
                menager.setLogin("João");
                menager.setPassword("123456");
                menager.setComission(1200);


                System.out.println(menager.getCode());
                System.out.println(menager.getSalary());
                System.out.println(menager.getName());
                System.out.println(menager.getLogin());
                System.out.println(menager.getPassword());
                System.out.println(menager.getComission());
                System.out.println(menager.getFullSalary(500));
            }
            case Salesman salesman -> {
                    salesman.setCode("456");
                    salesman.setName("Lucas");
                    salesman.setSalary(2800);
                    salesman.setPorcentPerSold(10);
                    salesman.setSoldAmout(10000);


                    System.out.println(salesman.getCode());
                    System.out.println(salesman.getSalary());
                    System.out.println(salesman.getName());
                    System.out.println(salesman.getPorcentPerSold());

            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("==============");
    }

}
