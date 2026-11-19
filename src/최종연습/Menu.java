package 최종연습;

public class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("메뉴명 : "+name);
        System.out.println("가격 : "+price);
    }

    public int getPrice() {
        return price;
    }
}
