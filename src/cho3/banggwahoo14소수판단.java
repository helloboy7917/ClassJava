package cho3;

import java.util.Scanner;

public class banggwahoo14소수판단 {
    static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요:");
        int num = new Scanner(System.in).nextInt();
        if(isPrime(num)){
            System.out.println("소수입니다.");
        }else{
            System.out.println("소수가 아닙니다.");
        }

        for (int i = 1; i < 101; i++) {
            if(isPrime(i)){
                System.out.println(i+" ");
            }

        }

    }
    static boolean isPrime(int n){
        if (n==1) return false;//1은 소수가 아니므로 처음에 이 코드를 무조건 넣어야 된다.
        int i=2;

        while (n>i){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
