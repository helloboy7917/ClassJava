package ch02;

import java.util.Scanner;

public class OndoChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("화씨 온도 입력해 착한 친구야: ");
        double ondo = input.nextDouble();

        System.out.printf("섭씨 온도는 %.2f도입니다.", (ondo - 32.0) / 9 * 5);

        input.close();
    }
}