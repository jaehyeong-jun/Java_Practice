import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("수박");
        fruits.add("사과");
        fruits.add("참외");
        fruits.add("메론");
        fruits.add("포도");
        fruits.add("딸기");

        fruits.clear();
        
        for (String item : fruits)
        {
            System.out.println(item);
        }


    }
}