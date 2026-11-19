package problemsolving;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class 편의점거스름돈 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int p = input.nextInt();
        int m = input.nextInt();
        int[] v = {0,0,0,0,0,0}; // 5000, 1000, 500, 100, 50, 10

        int pay = m -p;

        while (pay>0){
            if(pay>=5000){
                pay -= 5000;
                v[0]++;
            }else if(pay >=1000){
                pay -= 1000;
                v[1]++;
            }else if(pay >=500){
                pay -= 500;
                v[2]++;
            }else if(pay >=100){
                pay -= 100;
                v[3]++;
            }else if(pay >=50){
                pay -= 50;
                v[4]++;
            }else if(pay >=10){
                pay -= 10;
                v[5]++;
            }
            count++;
        }

        for(int i: v){
            System.out.println(i+" ");
        }
        System.out.println("\n"+count);


    }
}
