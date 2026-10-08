package ch02;

import java.util.Scanner;

public class gyogwasiuup18_예제 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력:");
        int h =in.nextInt();
        h +=1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
