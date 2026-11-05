package 수행평가연습;

public class Cart {
    Menu[] items = new Menu[10];
    int count=0;
    MemberGrade grade = MemberGrade.NORMAL;


    public void addMenu(Menu menu){
        if(count==10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count] = menu;
        count+=1;
    }

    public int calculateTotal(){
        int sum=0;

        if(count==0){
            System.out.println("장바구니가 비어있습니다.");
            return 0;
        }
        for (int i = 0; i < count; i++) {
            sum += items[i].getPrice();
        }
        return sum;
    }

    public void showCart(){
        if(count==0) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            items[i].showInfo();
        }
        System.out.println("총 주문 금액 : "+calculateTotal()+"원");


    }

    public void setMemberGrade(MemberGrade grade){
        this.grade = grade;
    }

    public int calculateFinalPrice(){
        if (grade== MemberGrade.VIP){
            return (int)(calculateTotal()*0.9);
        }else{
            return calculateTotal();
        }
    }

}
