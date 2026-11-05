package 키오스크.문제4;


public class KioskMain {
    static void main(String[] args) {

        // 메뉴 객체 생성
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        // 장바구니 생성 및 메뉴 추가
        Cart cart = new Cart();

        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        // 회원 등급 설정
        cart.setMemberGrade(MemberGrade.VIP);

        // 최종 결제 금액 계산
        int finalPrice = cart.calculateFinalPrice();

        // 결제 객체 생성
        Payment payment = new Payment("일반 결제");

        // 결제 금액 전달
        payment.pay(finalPrice);

    }
}
