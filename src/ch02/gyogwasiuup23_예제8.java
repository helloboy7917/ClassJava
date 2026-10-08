package ch02;




class Sudent{
    String name;
}
class Team {
    String teamName;
    int memberCount;
    int Max=4;
    void join(String name){
        if (memberCount >= Max){
            System.out.println("정원초과!");
        }
        else if (memberCount <= Max){
            memberCount+=1;
            System.out.println(name+"님 합류!");
        }
    }
}
public class gyogwasiuup23_예제8 {
    static void main(String[] args) {
        Team gg = new Team();
        Sudent Gg = new Sudent();
        Gg.name = "김세현";

        Sudent Ggg = new Sudent();
        Ggg.name = "나상효";

        Sudent Gggg = new Sudent();
        Gggg.name = "서온유";

        Sudent Ggggg = new Sudent();
        Ggggg.name = "김성찬";

        Sudent Gggggg = new Sudent();
        Gggggg.name = "김민우";

        gg.join(Gg.name);
        gg.join(Ggg.name);
        gg.join(Gggg.name);
        gg.join(Ggggg.name);
        gg.join(Gggggg.name);

    }






}
