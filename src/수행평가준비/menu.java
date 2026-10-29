package 수행평가준비;

public class menu {
    String name;
    int price;

    public menu(String name,int price){
        this.name=name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("메뉴명 : " + name);
        System.out.println("가격 : " + price);
    }

    public int getPrice(){
        return price;
    }



}
