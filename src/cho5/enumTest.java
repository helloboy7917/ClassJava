package cho5;
enum Grade{
    BASIC, GOLD, DIAMOND
}
public class enumTest {
    static void main(String[] args) {
        Grade[] values = Grade.values();
        for (Grade value : values){
            System.out.println("name : "+value.name()+" ordinal : "+value.ordinal());
        }
        String input = "Gold";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
