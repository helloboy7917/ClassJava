package ch02;

public class gyogwasiuup42 {
    static void main(String[] args) {
        printSum(1,2,3,4,5);
        printSum(10,20,30);
        System.out.println(String.format("My score is %.1f",99.8));
        System.out.println(String.join(",","one","two","three"));
    }

    public static void printSum(int... v){
        int sum = 0;
        for(int i:v)
            sum+=1;
        System.out.println(sum);
    }
}
