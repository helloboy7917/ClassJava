package 키오스크.문제5;

public class Payment {
    protected String paymentName;


    public Payment(String paymentName) {
        this.paymentName = paymentName;
    }

    public void pay(int amount){
        System.out.println("결제수단 : "+paymentName);
        System.out.println("결제금액 : "+amount);
        System.out.println("결제가 완료되었습니다.");
    }

}
