package cho3;

import java.util.Scanner;

public class banggwahoo1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수 입력:");
        int i = in.nextInt();

        boolean and, or, ornd;
        and = (i%4==0 && i%5==0);
        or = (i%4==0 || i%5==0);
        ornd = (i%4==0 || i%5==0) && (i%4==0 && i%5==0);
        System.out.println(and);
        System.out.println(or);
        System.out.println(ornd);

    }
}
