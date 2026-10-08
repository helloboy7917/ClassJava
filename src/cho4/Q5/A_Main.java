package cho4.Q5;

public class A_Main {
    static void main() {
        A a = new A();
        System.out.println(a.averageScore(1));
        System.out.println(a.averageScore(1,2));
        System.out.println(a.averageScore(1,2,3));
        System.out.println(a.averageScore(1,2,3,4));
        System.out.println(a.averageScore(1,2,3,4,5));
    }



}

class A{
    double averageScore(int...v){
        int sum = 0;
        for (int i = 0; i <v.length; i++) {
            sum +=v[i];
        }
        return  (double)sum/v.length;
    }
}