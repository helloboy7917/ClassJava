package problemsolving;

import java.util.Scanner;

public class DOJ {
    static void main() {

        Scanner input=new Scanner(System.in);

        int lan=input.nextInt();
        int[] point = new int[lan];
        int[] ans=new int[lan];
        int last=0;
        int count=0;


        for (int i = 0; i < point.length; i++) {
            point[i]=input.nextInt();
        }

        for (int i = 0; i < point.length; i++) {
            ans[i]=input.nextInt();
        }


        for (int i = 0; i < point.length; i++) {
            if (ans[i]==1){
                last=last+point[i];
                count+=1;
            }

        }
        System.out.println(last);
        System.out.println(count);
    }
}
