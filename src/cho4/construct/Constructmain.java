package cho4.construct;

public class Constructmain {
    static void main() {
        //클래스형 변수 = new 클래스명()
        Construct d = new Construct();
        Construct c = new Construct();
        c.name = "홍길동";//x001.name = "홍길동"x001에 접근해서 한다.
        c.age = 17;

        d.name = "김민수";
        d.age = 18;

        System.out.println("이름: "+c.name);
        System.out.println("이름: "+d.name);

    }
}
