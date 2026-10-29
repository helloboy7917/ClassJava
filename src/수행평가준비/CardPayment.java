package 수행평가준비;

public class CardPayment extends Payment{
    int cardBalennce;

    public CardPayment(String Paymentname) {
        super("카드결제");
    }


    public void pay(int amount){
        if(cardBalennce < amount) {
            System.out.println("카드잔액이 부족합니다.");
        }else{
            cardBalennce -= amount;
        }
    }


}
