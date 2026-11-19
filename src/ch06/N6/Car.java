package ch06.N6;

public class Car extends Vehicle{
    int displacement;
    int gi;


    public Car(String color, int speed, int displacement, int gi) {
        super(color, speed);
        this.displacement = displacement;
        this.gi = gi;
    }

    @Override
    void show() {
        super.show();
        System.out.println("배기량: "+displacement+" 기어: "+gi);
    }


}
