import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "DB");
        list.add("add");

        for (int i = 0; i < list.size(); i++)
        {
            String item = list.get(i);
            System.out.println(item);
        }

        System.out.println("총 개수는 : " + list.size());
        System.out.println(list);

        String skill = list.get(2);
        System.out.println(skill);
        list.remove("DB");
        System.out.println(list);
    }
}