package ch02.gyogwasiuup54_예제15;

public class Coffee extends Drink {
    void order(){
        System.out.println("커피주문");
    }

    void order(CoffeeSize size){
        System.out.printf("[%s]사이즈 커피 출력",size);
    }
}
enum CoffeeSize{
    SMALL, LARGE
}
