package cho4.N4;

public class Car {
    static int numOfCar = 0;
    static int numOfRedCar = 0;
    String color;



    public Car(String color){
        this.color = color;
        numOfCar++;
        if(color.compareToIgnoreCase("red") == 0){
            numOfRedCar++;
        }
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

    public static int getNumOfCar() {
        return numOfCar;
    }
}
