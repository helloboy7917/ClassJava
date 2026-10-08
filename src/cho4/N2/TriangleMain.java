package cho4.N2;

public class TriangleMain {
    static void main() {
        //클래스명 변수형 = new 클래스명();
        Triangle t1 = new Triangle(1210.0,5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0,8.0);

        System.out.println(t1.isSameArea(t2));
    }
}
