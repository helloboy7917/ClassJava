package 수행평가준비;

public class SimplePayment extends Payment {
    int point;

    public SimplePayment(int point){
        super("간편결제");
        this.point = point;
    }

    @Override
    public void pay(int amount){
        int p = (int) (amount*0.05);
        point += p;
        System.out.println(PaymentName+"로 결제할 금액 : "+amount+"원");
        System.out.println("새롭게 적립된 포인트 : "+p);
        System.out.println("총 보유 포인트 : "+point);
    }
}
