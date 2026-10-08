package cho3;

import java.util.Scanner;

public class banggwahoo6 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("나이입력:");
        int i = in.nextInt();

        if(i>=19){
            System.out.println("성년");
        }else{
            System.out.println("미성년");
        }

    }
}
