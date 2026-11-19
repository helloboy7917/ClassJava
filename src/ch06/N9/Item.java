package ch06.N9;

public class Item {
    protected String title;

    void printTitle(){
        System.out.println("제목: "+title);
    }

    public Item(String title) {
        this.title = title;
    }
}
