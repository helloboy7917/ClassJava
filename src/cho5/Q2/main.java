package cho5.Q2;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ",i);
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = a[a.length-1-i];
        }
        System.out.println("a의 모든 요소를 역순으로 복사 완료");

        for (int i = 0; i < n; i++) {
            System.out.printf("b[%d] = %d\n",i,b[i]);
        }
    }
}