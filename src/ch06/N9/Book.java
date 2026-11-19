package ch06.N9;

public class Book extends Item{
    protected String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    void read(){
        super.printTitle();
        System.out.println(title+"(저자:"+author+")을(를) 읽었습니다.");
    }
}
