import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add(0,"0");

        System.out.println(list.size());

        System.out.println(list.get(1));

        System.out.println(list);

        list.remove("0");

        System.out.println(list);

    }
}