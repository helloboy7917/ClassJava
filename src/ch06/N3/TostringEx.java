package ch06.N3;

class A {
    int v;
    @Override
    public String toString() {
        return "A{" +
                "v=" + v +
                '}';
    }
}

public class TostringEx{
    static void main(String[] args) {
        A a = new A();
        System.out.println(a);

    }
}