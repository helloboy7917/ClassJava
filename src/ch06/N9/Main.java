package ch06.N9;

public class Main {
    static void main(String[] args) {
        Item[] items = { new Book("어린왕자","생텍쥐페리"),
                         new Album("love Poem","아이유")};

        for (Item item: items){
            if(item instanceof Book b){
            b.read();
            }else if(item instanceof Album a){
                a.play();
            }
        }
    }
}
