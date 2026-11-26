package problemcolving2.N3;

public enum Beverage {
    WATER(700), COLA(1200), JUICE(1500), COFFEE(2000);

    private int price;

    Beverage(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
