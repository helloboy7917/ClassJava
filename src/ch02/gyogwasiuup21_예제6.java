package ch02;

class Aircon{
    int temp = 24;
    void tempUP(){
        if (temp ==30) {
            System.out.println("최대온도!");

        }
        else{
            temp+=1;
            System.out.println("온도업! 현재온도:"+temp);

        }


    }
}
public class gyogwasiuup21_예제6{
    static void main(){
        Aircon air=new Aircon();
        for (int i=0; i<10; i++) {
            air.tempUP();
        }
    }


}