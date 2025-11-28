import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 100; i++)
        {
            list.add(i);
        }

        System.out.println(list.contains(50));

        Object[] arr = list.toArray();

        System.out.println(arr[0]);
    }
}