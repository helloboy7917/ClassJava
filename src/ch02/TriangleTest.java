package ch02;

public class TriangleTest {
    static void main(String[] args) {
        TriangleTest t1 = new TriangleTest(10.0, 5.0);
        TriangleTest t2 = new TriangleTest(5.0, 10.0);
        TriangleTest t3 = new TriangleTest(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
    double base;
    double height;

    public TriangleTest(double base, double height){

        this.base = base;
        this.height = height;
    };

    public boolean isSameArea(TriangleTest t){
        return this.findArea()== t.findArea();
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double findArea(){
        return base *height/2;
    }


}
