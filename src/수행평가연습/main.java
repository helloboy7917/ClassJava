package 수행평가연습;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메뉴 객체 생성
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼", 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        // 장바구니 생성
        Cart cart = new Cart();
        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        // VIP 회원 설정
        cart.setMemberGrade(MemberGrade.VIP);

        // 최종 결제 금액
        int finalPrice = cart.calculateFinalPrice();

        System.out.println("최종 결제 금액: " + finalPrice + "원");

        System.out.println("1번 카드결제");
        System.out.println("2번 간편결제");

        System.out.print("입력 : ");
        int n = sc.nextInt();

        if(n==1){

        }


    }
}
