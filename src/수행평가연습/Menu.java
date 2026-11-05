package 수행평가연습;

public class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("메뉴명 : "+name+"가격 : "+price+"원");
    }

    public int getPrice() {
        return price;
    }
}
