package 수행평가준비;

public class main {
    static void main(String[] args) {
        menu m1 = new menu("아메리카노",3500);
        menu m2 = new menu("카페라떼",4000);
        menu m3 = new menu("블루베리 스무디",4500);

        //장바구니 객체생성
        Cart cart = new Cart();

        //빈 장바구니 확인
        cart.showCart();

        //메뉴추가
        cart.addMenu(m1);
        cart.addMenu(m1);
        cart.addMenu(m3);
        cart.addMenu(m3);


        System.out.println("총 주문금액: "+cart.calculateTotal()+"원");

        //장바구니 최대 개수 초과 확인
        for (int i = 0; i < 8; i++) {
            cart.addMenu(m1);
        }

        //최종 장바구니 조회
        cart.showCart();

        System.out.println("회원등급: "+cart.grade);
        System.out.println("최종 결제 금액:"+cart.calculateFinalPrice()+"원");

        cart.setMemberGrade(MemberGrade.VIP);

        System.out.println("회원등급: "+cart.grade);
        System.out.println("최종 결제 금액:"+cart.calculateFinalPrice()+"원");

        cart.setMemberGrade(MemberGrade.NORMAL);

        System.out.println("회원등급: "+cart.grade);
        System.out.println("최종 결제 금액:"+cart.calculateFinalPrice()+"원");

        Payment payment = new Payment("일반 결제");

        payment.pay(cart.calculateFinalPrice());

        System.out.println("\n====간편결제====");
        SimplePayment simple = new SimplePayment(1000);
        simple.pay(cart.calculateFinalPrice());

    }
}
