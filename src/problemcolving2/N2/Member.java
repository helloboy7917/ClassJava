package problemcolving2.N2;

public class Member {
    private String name;
    private int grade;

    private static int totalMembers = 0;
    private static int freshmenCount = 0;

    public Member(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalMembers++;
        if(grade ==1){
            freshmenCount++;
        }
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public static int getFreshmenCount() {
        return freshmenCount;
    }
}
