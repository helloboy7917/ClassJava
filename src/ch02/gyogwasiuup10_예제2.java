package ch02;

public class   gyogwasiuup10_예제2 {
    static void main(String[] args) {
        int n = 6;
        while (n!=1)
            if (n%2==0) {
                n = n / 2;
                System.out.println(n);
            }
            else if (n%2==1) {
                n = n * 3 + 1;
                System.out.println(n);
            }

    }
}

