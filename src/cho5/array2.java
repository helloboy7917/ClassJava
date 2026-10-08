package cho5;

import java.util.Scanner;

public class array2 {
    static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("배열 크기 입력: ");
        int num = in.nextInt();

        int[] v = new int[num];

        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }

        for (int i : v) {
            System.out.print(i+" ");
        }
    }
}
