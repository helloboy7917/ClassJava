package cho3;

public class ContinueEx {
    static void main() {
        int i = 0;
        while (i<=100){
            i++;
            if(i%2==0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
