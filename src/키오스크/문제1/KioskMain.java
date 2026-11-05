package 키오스크.문제1;

public class KioskMain {
    static void main(String[] args) {
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);
        m2.showInfo();
        System.out.println(m3.getPrice());

    }
}
