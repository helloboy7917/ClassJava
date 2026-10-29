package 문제1;

import java.util.Scanner;

public class 출력 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = in.nextInt();

        System.out.printf("%d의 제곱은 %d",a, a*a);
    }
}
