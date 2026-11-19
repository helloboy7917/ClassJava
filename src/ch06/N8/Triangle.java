package ch06.N8;

public class Triangle extends Shape{
    int base, heigth;

    public Triangle(int heigth, int base) {
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    double getArea() {
        return heigth*base/2.0;
    }
}
