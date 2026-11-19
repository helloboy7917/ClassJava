package ch06.N7;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void printInfo(){
        System.out.println("이름 : "+name+" 급여 : "+salary+"만원");
    }
}
