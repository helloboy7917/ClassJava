package cho4.N3;

public class MemberMain {
    static void main() {
        Member2 m  = new Member2("홍길동", "asd","qwe",18);

        System.out.println(m.getName());

        m.setName("김민수");

        System.out.println(m.getName());

    }
}