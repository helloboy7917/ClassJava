package ch02;

import java.util.Scanner;

public class gyogwasiuup5 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("등수를 입력하세요");
        int rank = in.nextInt();

        switch (rank) {
            case 1:
                System.out.println("1등임");
                break;
            case 2:
                System.out.println("2등임");
                break;
            case 3:
                System.out.println("3등임");
                break;
            default:
                System.out.println("머임?");
        }
    }
}
