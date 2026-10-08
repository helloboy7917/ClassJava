package ch02;

import java.util.Scanner;

public class gyogwasiuup52 {
    static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("URL을 입력하세요: ");
        String i = a.nextLine();

        boolean result = i.contains("com");

        if (result == true){
            System.out.println(i+"은 com으로 끝남");
        }



    }
}
