package ch02;

import java.util.Scanner;

public class Nasanghyo2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        double radis = input.nextDouble();
        System.out.print("원기둥의 밑면 높이는? ");
        double high = input.nextDouble();
        double pi = 3.14;
        System.out.printf("원기둥의 부피는 %.1f", pi*radis*radis*high);


    }
}

