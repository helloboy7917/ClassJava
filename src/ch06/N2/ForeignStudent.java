package ch06.N2;

public class ForeignStudent extends Student {
    String Foreign;

    public ForeignStudent(String name, int age, int num, String foreign) {
        super(name, age, num);
        Foreign = foreign;
    }

    public String getForeign() {
        return Foreign;
    }

    public void setForeign(String foreign) {
        Foreign = foreign;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(", 국적 : "+Foreign);
    }
}
