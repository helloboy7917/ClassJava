package ch02;

public class gyogwasiuup39 {
    static void main(String[] args) {
        int[] one3five = {0,1,2,3,4};
        int sum  = 0;

        for (int x = 0; x < one3five.length; x++) {
            one3five[x]++;
        }

        for(int x:one3five)
            sum+=x;

        System.out.println("평균 = "+sum/5.0);
    }
}
