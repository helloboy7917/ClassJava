package cho4.N5;

public class Line {
    int length;

    public Line(int length){
        this.length = length;
    }

    public boolean isSameArea(Line t) {
        return t.length == length;
    }
}
