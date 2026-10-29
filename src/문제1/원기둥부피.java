package 문제1;

import java.util.Scanner;

public class 원기둥부피 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? : ");
        int r = in.nextInt();

        System.out.print("원기둥의 높이는? : ");
        int h = in.nextInt();

        System.out.println(r*r*3.14*h);
    }
}
