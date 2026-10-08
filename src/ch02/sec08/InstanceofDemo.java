package ch02.sec08;

public class InstanceofDemo {
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
        if (p instanceof Student){
            Student s = (Student) p;
            System.out.println("해향 타입 변환");
        }
    }
}
