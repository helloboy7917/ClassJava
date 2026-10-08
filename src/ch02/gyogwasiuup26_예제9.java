package ch02;

public class gyogwasiuup26_예제9 {
    public static void main(String[] args) {
        Subway myoder = new Subway("이탈리안 비엠티");
        myoder.selctBread("플랫브레드").selctCheese("슈레드").selctSauce("스위트 칠리").serve();

    }
}

class Subway{
    String bread;
    String cheese;
    String sauce;
    String menu;
    public Subway (String menu) {
        this.menu=menu;
    }


    public Subway selctBread(String bread){
        this.bread=bread;
        return this;
    }


    public Subway selctCheese(String cheese){
        this.cheese=cheese;
        return this;
    }

    public Subway selctSauce(String sauce){
        this.sauce=sauce;
        return this;
    }

    public void serve(){
        System.out.println(bread+cheese+sauce);
    }
}