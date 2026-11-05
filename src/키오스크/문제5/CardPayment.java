package 키오스크.문제5;

public class CardPayment extends Payment{

    int cardBalance;

    public CardPayment(int cardBalance) {
        super("카드결제");//카드결제라고 바뀌야 됨
        this.cardBalance = cardBalance;
    }

    @Override
    public void pay(int amount) {
        if(cardBalance <amount){
            System.out.println("카드잔액이 부족합니다.");
        }else{
            cardBalance -= amount;
            super.pay(amount);//이거 전에 만들어논 부모꺼 쓰는 거임
            System.out.println("남은 카드 잔액 : "+cardBalance);
        }
    }
}
