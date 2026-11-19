package ch06.N7;

public class Main {
    static void main(String[] args) {
        Employee e = new Employee("나상효",3000);
        Manager m = new Manager("너상효",4000,"ai과");

        e.printInfo();
        m.printInfo();
    }
}
