package 키오스크.문제6;


import java.util.Scanner;

public class KioskMain {
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

        Payment p = null;//처음에 null이어야 됨
        do{
            int n;
            System.out.println("결제 수단을 선택하세요. 1.카드결제 2.간편결제");
            System.out.print("입력 : ");
            n = sc.nextInt();
            if(n==1){
                p= new CardPayment(30000);
            }else if(n==2){
                p= new SimplePayment(1000);
            }else{
                System.out.println("잘못된 결제 수단 입니다.");
            }
        }while (p==null);
        p.pay(finalPrice);
//다형성 코드 작성하기


    }
}
