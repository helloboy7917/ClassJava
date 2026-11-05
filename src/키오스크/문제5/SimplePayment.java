package 키오스크.문제5;

public class SimplePayment extends Payment{
    int point;

    public SimplePayment(int point) {//paymentName도 지우고
        super("간편결제");//이거 직접 써야됨
        this.point = point;
    }

    @Override
    public void pay(int amount) {
        super.pay(amount);
        int newpoint = (int)(amount*0.05);//적립 포인트
        point += newpoint;
        System.out.println("총 보유 포인트 : "+point);

    }
}
