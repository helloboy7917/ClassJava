package ch02;

import java.util.Scanner;

public class Nasanghyobabo {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int num = input.nextInt();

        System.out.printf("%d의 제곱은 %d",num, num*num);

    }
}
