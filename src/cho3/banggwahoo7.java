package cho3;

import java.util.Scanner;

public class banggwahoo7 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("등수를 입력하세요:");
        int i = in.nextInt();

        switch (i){
            case 1:
                System.out.println("야 기분좋다");
                break;
            case 2,3:
                System.out.println("기분좋다");
                break;
            case 4,5,6:
                System.out.println("우흥");
                break;
            default:
                System.out.println("흔들어라");
        }
    }
}
