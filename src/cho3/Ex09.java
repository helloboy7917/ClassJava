package cho3;

public class Ex09 {

    static void main() {
        Test(1,2,3,4);
        Test(1,2,3,4,5,6,7,8);
    }

    static void Test(int...a){

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
