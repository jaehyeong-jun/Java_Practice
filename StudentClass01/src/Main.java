import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {


        List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("강감찬", 30)
        , new Student("이순신", 20) );

        double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();

        double sum = list.stream().mapToInt(Student::getScore).sum();

        System.out.println((char)sum);

//        Stream<Student> stream = list.stream();
//        stream.forEach(s-> System.out.println(s.getName() + ":" + s.getScore()));
    }
}