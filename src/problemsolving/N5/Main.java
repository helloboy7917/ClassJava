package problemsolving.N5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Drink[] d = new Drink[n];


        for (int i = 0; i < n; i++) {
            String type = in.next();
            String menu = in.next();
            int price = in.nextInt();
            int shot = in.nextInt();

            if(type.equals("C")){
                d[i] = new Coffee(menu,price,shot);
            }
            else if(type.equals("S")){
                d[i] = new Smoothie(menu,price,true);
            }
        }


        int sum = 0;
        for (Drink drink : d) {
            int cost = drink.getTotalPrice();
            sum += cost;
            System.out.println(drink.Menu+" : "+drink.price+"원");



        }
        System.out.println("총 결제 금액 : "+sum+"원");
    }
}
