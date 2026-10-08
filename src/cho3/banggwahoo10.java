package cho3;

public class banggwahoo10 {
    static void main() {
        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b<=20 ; b++) {
                for (int c = 1; c <=20 ; c++) {
                    if(a+b+c<=20){
                        if(a*a+b*b == c*c){
                            System.out.println(a+" "+b+" "+c);
                        }
                    }

                }

            }

        }
    }
}
