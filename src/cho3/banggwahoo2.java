package cho3;

import java.util.Scanner;

public class banggwahoo2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("0~999 사이의 숫자를 입력하세요:");
        int i = in.nextInt();

        int j = i/100;
        int h = (i-j*100)/10;
        int g = i-j*100-h*10;
        System.out.println("각 자릿수의 합:"+(j+h+g));

    }
}
