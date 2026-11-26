package problemsolving.N5;

public class Coffee extends Drink{
    private int shot;

    public Coffee(String menu, int price, int shot) {
        super(menu, price);
        this.shot = shot;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+(shot*500);
    }
}
