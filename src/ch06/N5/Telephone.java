package ch06.N5;

public class Telephone extends Phone{
    private String when;

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void auto(){
        System.out.println(owner+"는 "+when+" 죽었다.");
    }



}
