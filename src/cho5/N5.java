package cho5;

import java.util.Scanner;

public class N5 {
    static void main() {
        int[] n = new int[10];
        Scanner in = new Scanner(System.in);
        int k = 0;
        System.out.println("숫자를 열개 입력하세요.");
        for (int i = 0; i < 10; i++) {
            k = in.nextInt();
            n[k/10]++;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("%2d ~ %2d : ",i*10,i*10 + 9);
            for (int j = 0; j < n[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
