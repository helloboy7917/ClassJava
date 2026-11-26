package problemsolving.N5;

public class Smoothie extends Drink{
    private boolean isLarge;

    public Smoothie(String menu, int price, boolean isLarge) {
        super(menu, price);
        this.isLarge = isLarge;
    }

    @Override
    public int getTotalPrice() {
        return isLarge ? super.getTotalPrice()+1000:super.getTotalPrice();
    }
}
