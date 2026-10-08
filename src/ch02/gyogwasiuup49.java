package ch02;
public class gyogwasiuup49 {
    static void main(String[] args) {
        Gender gender = Gender.FEMALE;

        String s = switch (gender) {
            case MALE -> "은 병역의무 o";
            case FEMALE -> "은 병역의무 x";
        };
        System.out.println(gender+s);


    }
}


