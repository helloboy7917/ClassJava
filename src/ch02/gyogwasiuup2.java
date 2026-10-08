package ch02;

import java.util.Scanner;

public class gyogwasiuup2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("짝!");
        else
            System.out.println("홀!");
        System.out.println("종료!");
    }
}
