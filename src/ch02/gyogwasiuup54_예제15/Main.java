package ch02.gyogwasiuup54_예제15;

public class Main {
    static void main() {
        Coffee coffee = new Coffee();

        coffee.order();
        coffee.order(3);
        coffee.order(CoffeeSize.LARGE);
    }
}
