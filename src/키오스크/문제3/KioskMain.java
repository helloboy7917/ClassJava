package 키오스크.문제3;


public class KioskMain {
    static void main(String[] args) {
        // 1. 메뉴 객체 생성
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        // 2. 장바구니 객체 생성
        Cart cart = new Cart();

        // 3. 장바구니에 메뉴 추가
        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        // 4. 장바구니 조회
        cart.showCart();

        // 5. 기본 회원 등급 확인 (NORMAL)
        System.out.println("회원 등급: " + cart.grade);
        System.out.println("최종 결제 금액: "
                + cart.calculateFinalPrice() + "원");

        // 6. VIP 회원으로 변경
        cart.setMemberGrade(MemberGrade.VIP);

        System.out.println("회원 등급: " + cart.grade);
        System.out.println("최종 결제 금액: "
                + cart.calculateFinalPrice() + "원");

        // 7. NORMAL 회원으로 변경
        cart.setMemberGrade(MemberGrade.NORMAL);

        System.out.println("회원 등급: " + cart.grade);
        System.out.println("최종 결제 금액: "
                + cart.calculateFinalPrice() + "원");



    }
}
