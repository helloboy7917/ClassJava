package ch02;

import java.util.Scanner;

public class gyogwasiuup31_12예제 {
    static void main() {
        String i = "Hello";
        String j = "hiHi1234";

        Scanner in = new Scanner(System.in);
        System.out.print("아이디:");
        String k = in.nextLine();

        Scanner inn = new Scanner(System.in);
        System.out.print("비밀번호:");
        String l = in.nextLine();

        System.out.println("아이디 일치 여부:"+i.equalsIgnoreCase(k));
        System.out.println("비밀번호 일치 여부:"+j.equals(l));
    }
}
