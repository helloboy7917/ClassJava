package ch02;

class Githubuser {
    String username;
    int commitcount;
    void doCommit(){
        commitcount+=1;
        System.out.println("커밋완료!");
    }
    void printStatus(){
        System.out.println("현재"+username+"의 잔디는 "+commitcount+"개!");
    }

}
public class gyogwasiuup22_예제7 {
    static void main(String[] args) {
        Githubuser gg = new Githubuser();
        gg.username = "나상효";
        gg.doCommit();
        gg.doCommit();
        gg.printStatus();
    }
}