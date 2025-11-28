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

//        Person person1 = new Person("홍길동");
//        Person person2 = new Person("김철수");
//        Person person3 = new Person("이영희");

        persons.add(new Person("홍길동"));
        persons.add(new Person("김철수"));
        persons.add(new Person("이영희"));

        for(Person P : persons)
        {
            System.out.println(P.getName());
        }

        System.out

                .println("\n<<"+ persons.get(1).getName() +" 삭제 후>>\n" );
        persons.remove(1);


        System.out.println("현재 인원 수: "+persons.size());
        for(Person P : persons)
        {
            System.out.println(P.getName());
        }



    }
}