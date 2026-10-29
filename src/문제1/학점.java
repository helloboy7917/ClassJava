package 문제1;

import java.util.Scanner;

public class 학점 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("전공 이수 학점");
        int a = in.nextInt();

        System.out.print("교양 이수 학점");
        int b = in.nextInt();

        System.out.print("일반 이수 학점");
        int c = in.nextInt();

        System.out.println((a>69 && (b>29 && c>29) || (b+c>79)) ? "졸업가능":"졸업 불가능");
    }
}
