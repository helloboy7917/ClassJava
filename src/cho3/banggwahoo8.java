package cho3;

import java.util.Scanner;

public class banggwahoo8 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i;
        do{
            System.out.println("양의 정수를 입력하세요:");
            i =  in.nextInt();
            if(i%2==0){
                sum += i;
            }
        }while(i>0);

        System.out.println(sum);

    }
}
