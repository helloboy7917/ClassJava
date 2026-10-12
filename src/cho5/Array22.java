package cho5;

public class Array22 {
    static void main() {
        int[][] arr ={{1,2,3},
                      {4,5,6}};

        System.out.println(arr.length);//2행의 개수
        System.out.println(arr[0].length);//열의 개수
        System.out.println(arr[1].length);

        for (int i = 0; i < arr.length; i++) {//arr.lenth에 빈칸
            for (int j = 0; j < arr[i].length; j++) {//arr[i].lenth에 빈칸
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
