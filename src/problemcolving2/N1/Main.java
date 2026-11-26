package problemcolving2.N1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a = in.nextInt();


        for (int i = 0; i < a; i++) {
            int v = i;
            while(v>0){
                int temp = v%10;//36%10 = 6
                if(temp==3 || temp==6 ||temp ==9){
                    count++;
                }
                v /= 10;
            }
        }

        System.out.println(count+"번");

        //System.out.println((a/10)*3+((a%10)/3)+"번");
    }
}
