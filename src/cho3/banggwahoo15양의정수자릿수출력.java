package cho3;

import java.util.Scanner;

public class banggwahoo15양의정수자릿수출력 {
    static void main() {
        int plus;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("양의 정수값:");
            plus = in.nextInt();

        }while (plus<0);
        int temp=plus;
        //자릿수 확인
        int k =  0;

        while (plus>0){
            k++;//자릿수 증가
            plus /= 10;

        }
        System.out.print(temp+"의 자리수는 "+k+"입니다.");

    }
}
