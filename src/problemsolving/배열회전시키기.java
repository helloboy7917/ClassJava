package problemsolving;

import java.util.Scanner;

public class 배열회전시키기 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int[] v = new int[a];
        int[] change = new int[a];

        for (int i = 0; i < a ; i++) {
            v[i] = in.nextInt();
            change[(i+b)%a] = v[i];
        }

        for (int i : change) {
            System.out.print(i+" ");
        }




    }
}
