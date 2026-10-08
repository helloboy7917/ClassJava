package cho4.N8;

import java.util.Random;

public class DiceMain {
    static void main() {
        roll a = new roll();
        System.out.println(a.roll());




        System.out.println(Math.random());

        Random b = new Random();
        System.out.println(b.nextInt(1,10));
    }
}
