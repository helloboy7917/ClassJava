package ch06.N9;

public class Album extends Item{
    private String artist;

    public Album(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    void play(){
        super.printTitle();
        System.out.println(title+"(가수: "+artist+")을(를) 재생합니다.");
    }
}
