package cho5.Q3;

import java.util.Scanner;

public class 과목평균문제 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int num = 3;
        int[][] scores = new int [num][2];// 과목별 점수 저장
        int[] sum = new int[num];//총점

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i+1 +"번 학생의 점수 입력");
            for (int j = 0; j < scores[i].length; j++) {
                if(j==0){
                    System.out.print("국어 : ");
                }else if(j==1){
                    System.out.print("수학 : ");
                }
                scores[i][j] = in.nextInt();
                sum[i] += scores[i][j];
            }
        }

        System.out.println("No.\t국어\t수학\t평균");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\n",i+1,scores[i][0],scores[i][1],sum[i]/2.0);
        }
    }
}
