package cho4.construct2;

public class Construct {
    String name;
    int age;

    public Construct(String n, int age){
        System.out.println("생성자 호출");
        name = n;//매개변수와 필드가 다르면 this를 안 써도 된다.
        this.age=age;
    }
}
