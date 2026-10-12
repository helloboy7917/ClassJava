package cho5;

enum Direction{
    동,서,남,북
}

public class N3 {
    static void main(String[] args) {
        for(Direction d : Direction.values()){
            System.out.println(d+" ");
        }
    }
}
