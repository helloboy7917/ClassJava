package cho4.N1;

public class Triangle {
    double base;//밑변
    double height;//높이

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Area(){
        return  base * height/2;
    }
}
