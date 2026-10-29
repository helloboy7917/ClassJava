package cho3;

public class N6 {
    static void main(String[] args) {
        int[] data = {1,3,5,7,9};
        int[] result = reverse(data);

        for (int i : result) {
            System.out.print(i+" ");
        }
    }

    private static int[] reverse(int[] org){
        int[] n = new int[org.length];
        for (int i = 0; i < org.length; i++) {
            n[i]= org[org.length-1-i];
        }
        return n;
    }
}
