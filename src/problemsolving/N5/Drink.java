package problemsolving.N5;

public class Drink {
    protected String Menu;
    protected int price;

    public Drink(String menu, int price) {
        Menu = menu;
        this.price = price;
    }

    public int getTotalPrice() {
        return price;
    }


}
