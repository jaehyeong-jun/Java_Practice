import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //객체간의 비교를 할때의 기준을 제시
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score, o.getScore());
    }
    // 음수 : 작음, 0 : 같음, 양수 : 큼
}

public class Main {
    public static void main(String[] args) {

        IntStream stream = Arrays.stream(new int[]{1,3,4,5,6});

        stream.sorted().forEach(i-> System.out.print(i+" "));
        System.out.println();

        List<Student> list = Arrays.asList(
                new Student("홍길동",90),
                new Student("이순신", 100),
                new Student("강감찬",98)
        );
        list.stream().sorted().forEach(s ->{
            System.out.println(s.getName() +"/" +s.getScore());
        });

        list.stream().sorted(Comparator.reverseOrder()).forEach(s ->{
            System.out.println(s.getName() +"/" +s.getScore());
        });
    }
}