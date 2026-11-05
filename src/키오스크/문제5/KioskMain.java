package 키오스크.문제5;


import java.util.Scanner;

public class KioskMain {
    static void main(String[] args) {

        // 1. 메뉴 객체 생성
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        // 2. 장바구니 생성 및 메뉴 추가
        Cart cart = new Cart();

        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        // 3. VIP 회원 설정
        cart.setMemberGrade(MemberGrade.VIP);

        // 4. 최종 결제 금액 계산
        int finalPrice = cart.calculateFinalPrice();

        System.out.println("총 주문 금액: " + cart.calculateTotal());
        System.out.println("최종 결제 금액: " + finalPrice);

        // 5. 카드 결제 성공 확인
        System.out.println("\n===== 카드 결제 성공 =====");
        CardPayment card1 = new CardPayment(20000);
        card1.pay(finalPrice);

        // 6. 카드 결제 실패 확인
        System.out.println("\n===== 카드 결제 실패 =====");
        CardPayment card2 = new CardPayment(5000);
        card2.pay(finalPrice);

        // 7. 간편결제 확인
        System.out.println("\n===== 간편결제 =====");
        SimplePayment simple = new SimplePayment(1000);
        simple.pay(finalPrice);


    }
}
