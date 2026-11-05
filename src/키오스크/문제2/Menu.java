package 키오스크.문제2;

public class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("메뉴명 : "+name +"가격 : "+price);
    }

    public int getPrice() {
        return price;
    }




}
