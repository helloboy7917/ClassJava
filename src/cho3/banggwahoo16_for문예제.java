package cho3;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class banggwahoo16_for문예제 {
    static void main() {
        /*for (int i = 0; i < 5; i++) {//5줄
            for (int k = 0; k < (4-i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i+1); j++) {
                                  System.out.print("*");


            }
            System.out.println();
        }*/


        Scanner in = new Scanner(System.in);
        System.out.print("층수입력:");
        int h = in.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < (h-i-1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
