package ch06.N5;

public class Smartphone extends Telephone{
    private String Gname;

    public Smartphone(String owner, String when, String Gname) {
        super(owner, when);
        this.Gname = Gname;
    }

    void playGame(){
        System.out.println(owner+"는 "+Gname+"플레이 중");
    }
}
