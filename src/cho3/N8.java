package cho3;

import java.util.Scanner;
enum Day {
    SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class N8 {
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Day day = Day.valueOf(s);

        switch (day){
            case MONDAY ->
                System.out.println("싫다.");
            case FRIDAY ->
                System.out.println("좋다!");
            case SUNDAY,SATURDAY->
                System.out.println("최고");
            default->
                System.out.println("그저 그렇다");
        }
    }

}


