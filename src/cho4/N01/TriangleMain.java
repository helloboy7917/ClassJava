package cho4.N01;

public class TriangleMain {
    static void main() {
        //클래스명 변수형 = new 클래스명();
        Triangle triangle = new Triangle(10, 5);
        //triangle.b=10;
        System.out.println(triangle.findArea());

        Triangle t = new Triangle();
        System.out.println(t.findArea());//b = 15 h = 7
    }
}
