import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("이순신", "홀길동", "강감찬");

        for(String st : list)
        {
            System.out.println(st);
        }

        Collections.sort(list);
        System.out.println();

        for(String st : list)
        {
            System.out.println(st + "\t");
        }

        int[] arr = {5,4,2,1,3};

        Arrays.sort(arr);

        for(int i : arr)
        {
            System.out.println(i);
        }


    }
}