package cho5.Q1;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        int count =0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int num = in.nextInt();

        int[] v = new int[num];

        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }

        for (int i : v) {
            System.out.println("a["+count+"] = " + i);
            count += 1;
        }
    }
}
