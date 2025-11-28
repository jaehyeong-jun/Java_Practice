import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);     scores.add(98);
        scores.add(75);     scores.add(95);
        scores.add(80);

        Integer value = null;
        value = scores.first();

        System.out.println(value);

        System.out.println(scores.last());

        System.out.println(scores.lower(98));

        System.out.println(scores.higher(75));

        Iterator<Integer> iter = scores.iterator();

        while(iter.hasNext()){
            int s = iter.next();
            System.out.println(s);
        }
    }
}