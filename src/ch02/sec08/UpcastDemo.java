package ch02.sec08;

public class UpcastDemo {
    public static void main(String[] args) {
        person p;
        Student s = new Student();

        p=s;
        //p.number = 1;
        //p.work();

        p.whoami();
    }
}
