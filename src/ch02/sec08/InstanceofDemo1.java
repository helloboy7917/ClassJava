package ch02.sec08;

public class InstanceofDemo1 {
    static void main(String[] args) {
        Student s = new Student();
        person p = new person();

        System.out.println(s instanceof person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof  Student);

        //System.out.println(s instanceof String);
        downcast(s);
    }

    static void downcast(person p){
        if (p instanceof Student s){
            s.work();
            System.out.println("해향 타입 변환");
        }
    }
}
/*Vehicle v = new Car(); -> 참조변수 타입 Vehicle 실제 객체 Car
필드로 하면 참조 기준으로 찾는다.

 */
