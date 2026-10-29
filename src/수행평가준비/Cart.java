package 수행평가준비;

public class Cart {
    menu[] items = new menu[10];
    int count = 0;
    MemberGrade grade;

    Cart() {
        this.grade = MemberGrade.NORMAL;
    }

    public void setMemberGrade(MemberGrade grade){
        this.grade = grade;
    }

    public int calculateFinalPrice(){
        int total = calculateTotal();
        if(grade == MemberGrade.VIP){
            total *= 0.9;
        }
        return total;
    }

    public void addMenu(menu menu){
        if (count >= 10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count]=menu;
        count+=1;

    }

    public int calculateTotal(){
        int total = 0;
        for (int i = 0; i < count; i++) { // 담긴 개수(count)만큼만 반복
            total += items[i].getPrice();
        }
        return total;
    }

    public void showCart(){
        if (count == 0){
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            items[i].showInfo();
        }
        System.out.println("주문금액"+calculateTotal());
    }
}
