package ch02;

public class Ex2 {
    static void main(String[] args) {
        //변수값 a,b를 바꿔보자
        int a,b;
        a = 20;
        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("바꿘 후");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
