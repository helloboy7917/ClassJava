package ch02;

import java.util.Locale;

public class gyogwasiuup29 {
    static void main(String[] args) {
        String s1 = new String("hi,");
        String s2 = new String(" Java");

        System.out.println("문자열 길이(s1):  "+ s1.length());
        System.out.println(s1.charAt(1));

        s1 = s1.concat(s2);

        System.out.println(s1.concat(s2)+"!");
        System.out.println(s1.toLowerCase()+"!");
        System.out.println(s1.substring(4, 8)+"!");

        String s3 = " ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
        String s4 ="";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());

        String s5 ="*-*";
        System.out.println(s5.repeat(10));
        System.out.println(s2.trim().indexOf("V"));



        /*
        String s1 ="Hi, Java";
        String s2 =new String("Hi, java");
        String s3 ="Hi, Code";
        String s4 ="Hi, java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s3.compareTo(s4));
        System.out.println("Hi, Java".compareToIgnoreCase("hi, java"));
        */


        /*
        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");
        String s4 = new String("hi");

        System.out.println("s1 == s2 ->" +(s1 == s2));
        System.out.println("s1 == s3 ->" +(s1 == s3));
        System.out.println("s3 == s4 ->" +(s3 == s4));

        s1=s3;
        System.out.println("s1 == s3 ->" +(s1 == s3));
*/

    }
}
