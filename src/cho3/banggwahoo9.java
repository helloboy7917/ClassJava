package cho3;

public class banggwahoo9 {
    static void main() {

        for (int i = 1; i < 6; i++) {//가로 줄 개수
            for (int j = 6; j > i; j--) {//세로 줄 개수
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
