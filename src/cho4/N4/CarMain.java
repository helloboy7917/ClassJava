package cho4.N4;

public class CarMain {
    static void main() {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("Red");

        System.out.println("자동차수: "+c1.getNumOfCar()+"  빨간색 자동차수: "+Car.getNumOfRedCar());

    }

}
