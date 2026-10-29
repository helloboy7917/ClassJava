package 수행평가준비;

public class Payment {
    protected String PaymentName;

    public Payment(String Paymentname){
        this.PaymentName = Paymentname;
    }

    public void pay(int amount){
        System.out.println(PaymentName+"로 결제할 금액은 "+amount+"원 입니다.");
    }
}
