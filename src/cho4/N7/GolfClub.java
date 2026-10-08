package cho4.N7;

public class GolfClub {
    int num;

    public GolfClub(int num){
            this.num=num;
    }

    public  GolfClub(){
        this.num = 0;
    }

    public void print(){
        if (num == 0) {
            System.out.println(0 + "이다");
        }else{
            System.out.println(num);
        }
    }
}
