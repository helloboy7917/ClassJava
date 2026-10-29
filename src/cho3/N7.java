package cho3;

public class N7 {
    static void main(String[] args) {
        int[] a = {3,1,4,1,5};
        int[] b = {3,1,4,1};
        int[] c = {3,1,4,1,5};
        int[] d = {2,7,1,8,2};

        System.out.println(eq(a,a));
        System.out.println(eq(a,b));
        System.out.println(eq(a,c));
        System.out.println(eq(a,d));

    }

    public static boolean eq(int[] o,int[] r){
        if(o.length != r.length){
            return false;
        }else{
            for (int i = 0; i < o.length; i++) {
                if(o[i]!=r[i]){
                    return false;
                }
            }
            return true;

        }
    }
}
