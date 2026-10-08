package cho3;

import java.util.Scanner;

public class 연습1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("수 입력:");
        int h = in.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
