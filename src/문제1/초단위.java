package 문제1;

import java.util.Scanner;

public class 초단위 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("초단위 정수를 입력 하세요 : ");
        int a = in.nextInt();

        int m = a/60;
        int h = m/60;
        int s = a - (h*360) - (m*60);


        System.out.println(h);
        System.out.printf("%d시간 %d분 %d초",h,m,s);
    }
}
