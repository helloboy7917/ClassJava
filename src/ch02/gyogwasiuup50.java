package ch02;

public class gyogwasiuup50 {
    static int countChar(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(c == s.charAt(i)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] ages){
        System.out.println(countChar("jazz",'z'));
    }
}