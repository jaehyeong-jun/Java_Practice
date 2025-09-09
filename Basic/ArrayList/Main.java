import java.util.ArrayList;

class Person{
    private String name;
    Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person p1 = new Person("홍길동");
        Person p2 = new Person("김철수");
        Person p3 = new Person("이영희");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for(Person P : persons)
        {
            System.out.println(P.getName());
        }

        System.out.println("\n<<"+ p2.getName() +" 삭제 후>>\n" );
        persons.remove(p2);


        System.out.println("현재 인원 수: "+persons.size());
        for(Person P : persons)
        {
            System.out.println(P.getName());
        }



    }
}