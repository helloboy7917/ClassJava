package cho3;

import java.util.Scanner;

public class banggwahoo11 {
    static void main(String[] args) {
        String i = input("철수");
        String j = input("영희");
        whosWin(i, j);


    }

    static String input(String name){
        Scanner in = new Scanner(System.in);
        System.out.print("name");
        String x = in.nextLine();
        return x;



    }

    private static void whosWin(String i, String j) {
        if(i.equals(j)) {
            System.out.println("무승부");
        }else if((i.equals("s") && j.equals("p"))||(i.equals("p") && j.equals("r")) ||(i.equals("r") && j.equals("s"))){
            System.out.println("철수 승리!!");
        }else if((j.equals("s") && i.equals("p"))||(j.equals("p") && i.equals("r")) ||(j.equals("r") && i.equals("s"))){
            System.out.println("영희 승리!!");
        }
    }
}
