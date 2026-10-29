package 문제1;

import java.util.Scanner;

public class 자릿수 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int a = in.nextInt();

        int a1 = a/100;

        int a2 = a/10 - (a1*10);

        int a3 = a - (a1*100) - (a2*10);


        System.out.println(a1+a2+a3);
    }
}
