package ch06.N2;

public class Student extends Person {
    int num;


    public Student(String name, int age, int num) {
        super(name, age);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(", 학번 : "+num);
    }
}
