package cho3;

import java.util.Scanner;

public class banggwahoo5 {
    static void main() {
        Scanner in  = new  Scanner(System.in);
        System.out.println("정수입력:");
        int i = in.nextInt();
        int sum = 1;

        for (int j = 1; j<=i; j++){
            sum = sum * j;
        }
        System.out.println(sum);

        int f = 0;//합은 다른 값에 영향을 주지 않기 위해 0부터 시작
        for (int g = 0; g <= i; g++) {
            f+=g;

        }
        System.out.println(f);
    }
}
