package ch02;

class Phone {
    String model;
    int value;

    void print() {
        System.out.println(value + "만원짜리" + model+"스마트폰");
    }

}

public class gyogwasiuup19 {
    public  static  void main(String[] arge) {
        Phone myPhone = new Phone();
        myPhone.model = "갤럭시 s8";
        myPhone.value = 100;
        myPhone.print();

        Phone yourPhone = new Phone();
        myPhone.model = "G6";
        myPhone.value = 85;
        myPhone.print();
    }
}