package cho5;




public class N1 {
    static void main() {
        System.out.println(countChar("jazz",'z'));
    }
    private static int countChar(String i,char c ){
        int count = 0;

        for (int j = 0; j < i.length(); j++) {
            if (i.charAt(j) == c){
                count+=1;
            }
        }
        return count;

    }
}
