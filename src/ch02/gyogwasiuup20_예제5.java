package ch02;

class StudentCard {
    String name;
    String major;

    void showInfo(){
        System.out.println("==학생증==");
        System.out.println("이름: "+name);
        System.out.println("전공: "+major);
    }
}

public class gyogwasiuup20_예제5 {
    public static void main(String[] arge){
        StudentCard mestdent=new StudentCard();
        mestdent.name="김성찬";
        mestdent.major="백엔드";
        mestdent.showInfo();

    }
}