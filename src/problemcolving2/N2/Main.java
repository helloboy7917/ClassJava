package problemcolving2.N2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            new Member(in.next(), in.nextInt());

        }
        System.out.println("전체 부원: "+Member.getTotalMembers());
        System.out.println("1학년 학생 수: "+Member.getFreshmenCount());
    }
}
