package problemsolving;

import java.util.Scanner;

public class 편의점거스름돈나머지연산자 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int p = input.nextInt();
        int m = input.nextInt();
        int[] v = {5000,1000,500,100,50,10}; // 5000, 1000, 500, 100, 50, 10
        int count = 0;
        int pay = m -p;

        for (int i : v){
            int n = pay/i;
            count++;
            System.out.println(n+"");
            pay %= i;

        }
        System.out.println("\n"+count);


    }
}
