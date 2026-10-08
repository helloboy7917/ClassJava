package cho3;

public class switch_test {
    static  void main(){
        int v = 3;

        switch (v){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3,4:
                System.out.println("3 4");
            default:
                System.out.println("default");
        }
    }
}
