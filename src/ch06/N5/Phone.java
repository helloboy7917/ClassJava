package ch06.N5;

public class Phone {
    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }
    void talk(){
        System.out.println(owner+"통화중 ");
    }
}
