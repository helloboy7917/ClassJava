package ch06.N8;

public class Rectangle extends Shape{
    int width;
    int heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    double getArea(){
        return (double)width*heigth;
    }
}
