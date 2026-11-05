package ch06.N2;

public class main {
    static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("길동이", 22);
        people[1] = new Student("황진이", 23,100);
        people[2] = new ForeignStudent("Amy", 20,200,"미국");

        for (Person person : people) {
            if(person instanceof ForeignStudent){
                System.out.print("외국학생 ");
                person.show();
            } else if (person instanceof Student) {
                System.out.print("학생 " );
                person.show();
            }else{
                System.out.print("사람 ");
                person.show();
            }
            System.out.println();
        }

    }
}
