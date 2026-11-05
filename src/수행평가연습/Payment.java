package 수행평가연습;

public class Payment {
    protected String paymentName;

    public Payment(String paymentName) {
        this.paymentName = paymentName;
    }

    public void pay(int amount){
        System.out.println("결제 수단 : "+paymentName);
        System.out.println("결제 금액 : "+amount+"원");
    }


}
