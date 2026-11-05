package 수행평가연습;

public class SimplePayment extends Payment{
    int point;

    public SimplePayment(int point) {
        super("간편결제");
        this.point = point;
    }

    @Override
    public void pay(int amount) {
        point += (int)(amount*0.05);
        super.pay(amount);
        System.out.println("적립된 포인트 : "+(int)(amount*0.05));
        System.out.println("총 보유 포인트 : "+point);
    }
}
