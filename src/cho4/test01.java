package cho4;

public class test01 {
    int a;//인스턴스or필드
    double b;
    boolean c;
    //String d;

    static void main() {
        int x;
        test01 t1 = new test01();


        //system.out.println(x);<-오류 뜸
        System.out.println(t1.a);
    }
}
