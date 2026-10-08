package ch02;


public class gyogwasiuup14_예제3 {
    static void main(String[] args) {
        for (int i = 1; i < 36; i++) {
            int u = i % 10;
            int n = i / 10;
            int token = 0;

            if (n == 3 || n == 6 || n == 9) {
                token += 1;
            }
            if (u == 3 || u == 6 || u == 9) {
                token += 1;
            }

            if (token==1)
                System.out.println("짝");
            else if (token==2)
                System.out.println("짝짝");
            else{
                System.out.println(i);
            }


        }
    }

    public static class gyogwasiuup44 {

    }
}
