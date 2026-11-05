package 키오스크.문제5;

public class Cart {
    Menu[] items = new Menu[10];//이거 외우셈ㅇㅇ
    int count;
    MemberGrade grade = MemberGrade.NORMAL;


    public void addMenu(Menu menu){
        if (count == 10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count]=menu;//이것도 중요
        count++;

    }

    public int calculateTotal(){
        int sum = 0;//총합 가격

        if(count == 0) {
            return 0;
        }

        for (int i = 0; i < count; i++) { //lengh 쓰면 안 됨 count로 해야됨
            sum += items[i].getPrice();//getprice 써야됨
        }

        return sum;

    }

    public void showCart(){
        if (count==0){
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        for (int i = 0; i < count; i++) {//lengh쓰면 안됨
            items[i].showInfo();//showInfo사용해서 출력하게
        }
        System.out.println("총금액 : "+calculateTotal());//외워
    }

    public void setMemberGrade(MemberGrade grade){
        this.grade = grade;
    }

    public int calculateFinalPrice(){
        if(grade == MemberGrade.VIP){
            return (int) (calculateTotal() * 0.9);
        }
        return calculateTotal();
    }

}