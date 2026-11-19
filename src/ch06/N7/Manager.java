package ch06.N7;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }


    @Override
    void printInfo() {
        super.printInfo();
        System.out.print("부서 : "+department);
    }


}
