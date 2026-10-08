package cho3;

public class MethidEx {
    static void main() {
        System.out.println("1 부터 10까지의 합="+sum(1,10));
    }

    private static int sum(int a, int b) {
        int s = 0;
        for (int i = 1; i <10 ; i++) {
            s +=i;
        }
        return s;//ctrl + alt + m 메인에서 메소드 생성
    }

}
