package 키오스크.문제2;


public class KioskMain {
    static void main(String[] args) {
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        // 2. 장바구니 객체 생성
        Cart cart = new Cart();

        // 3. 빈 장바구니 확인
        cart.showCart();

        // 4. 메뉴 추가
        cart.addMenu(m1);
        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        // 5. 장바구니 조회
        cart.showCart();

        // 6. 총 주문 금액 확인
        System.out.println("총 주문 금액: "
                + cart.calculateTotal() + "원");

        // 7. 장바구니 최대 개수 초과 확인
        for (int i = 0; i < 7; i++) {
            cart.addMenu(m1);
        }

        // 8. 최종 장바구니 조회
        cart.showCart();


    }
}
