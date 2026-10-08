package cho3;

public class banggwahoo12 {
    static void main(String[] args) {
        System.out.println(factorial(5));
    }
    /*static int factorial(int i){
        int count = 1;
        for (int j = i; j > 0; j--) {
            count *=j;

        }return count;
    }*/
    static int factorial(int n){

        switch (n){
            case 0,1:
                return 1;
            default:
                return n* factorial(n-1);
        }
        /*return switch (n){
            case 0,1 -> 1;
            default -> n* factorial(n-1);
        };*/ //앞의 코드와 똑같이 작동한다.
    }
}
