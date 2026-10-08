package cho4.Q4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A_Main {
    static void main() {
        int m =5;//지역변수
        int[] n = {1,2,3};

        A a= new A();

      //  System.out.println("m = " + m);//값
      //  System.out.println("n = " + n);//주소
        a.abc(m);//기본값 넘김
        a.bcd(n);//참조값

        System.out.println(m);
        System.out.println(Arrays.toString(n));


    }
}

class A{
    void abc(int k){
        k=8;
    }
    void bcd(int b[]){
        b[0]=4;
        b[1]=5;
        b[2]=6;
    }
}