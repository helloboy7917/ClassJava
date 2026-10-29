package 문제1;

import java.util.Scanner;

public class or이다 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int a = in.nextInt();


        System.out.println(a % 4 == 0 && a % 5 == 0);
        System.out.println(a % 4 == 0 || a % 5 == 0);
        System.out.println(a % 4 == 0 ^ a % 5 == 0);
    }
}
