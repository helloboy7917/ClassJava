package 수행평가연습;

public class CardPayment extends Payment{
    int cardBalance;

    public CardPayment(int cardBalance) {
        super("카드 결제");
        this.cardBalance = cardBalance;
    }

    @Override
    public void pay(int amount) {
        if(cardBalance < amount){
            System.out.println("카드 잔액이 부족합니다.");
            return;
        }

        cardBalance -= amount;
        super.pay(amount);
        System.out.println("결제가 완료되었습니다.");
        System.out.println("카드잔액 : "+cardBalance+"원");
    }


}
