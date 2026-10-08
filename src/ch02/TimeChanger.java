package ch02;

import java.util.Scanner;

public class TimeChanger {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요: ");
        int second = input.nextInt();

        int p_second = second % 60;

        int p_min = second / 60 % 60;

        int p_hour = second / 60 / 60 % 60;

        System.out.printf("%d시간 %d분 %d초", p_hour, p_min, p_second);
    }
}
