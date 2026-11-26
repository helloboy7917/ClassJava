package problemcolving2.N3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();//음료개수

        for (int i = 0; i < n; i++) {
            String b = in.next().toUpperCase();//음료종류
            int c = in.nextInt();//개수

            Beverage beverage = Beverage.valueOf(b);

            sum += beverage.getPrice()*c;
        }

        System.out.println(sum);



    }
}
