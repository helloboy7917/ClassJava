package ch02;

import java.util.Locale;
import java.util.Scanner;

public class gyogwasiuup30_예제11 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("이메일입력:");
        String i = in.nextLine();
        int a = i.length();
        int j = i.indexOf("@");
        String h = i.substring(j+1,a);
        System.out.println(i.substring(0,j));
        System.out.println(h.toUpperCase());
    }


}
