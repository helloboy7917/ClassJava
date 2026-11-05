package 수행평가연습;

public class CardPayment extends Payment{
    int cardBalance;

    public CardPayment( int cardBalance) {
        super("카드 결제");
        this.cardBalance = cardBalance;
    }

    @Override
    public void pay(int amount) {
        if(amount > cardBalance) {
            System.out.println("카드 잔액이 부족합니다.");
        }else{
            cardBalance -= amount;
            super.pay(amount);
            System.out.println("카드잔액 : "+cardBalance);
        }
    }
}
