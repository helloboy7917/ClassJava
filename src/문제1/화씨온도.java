package 문제1;

import java.util.Scanner;

public class 화씨온도 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요 : ");
        double f = in.nextInt();

        double b = (double)5/9;
        System.out.println(b*(f-32));
    }
}
