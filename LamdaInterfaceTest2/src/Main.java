public class Main {
    public static void main(String[] args) {


        MyInterface mi;

        mi = (int x) ->{
            int result = x*5;
            System.out.println(result);
        };
//        mi.method(5);

        mi = (int x) ->{
            System.out.println(x*5);
        };

        mi = (int x) -> System.out.println(x*9);

        mi.method(7);
    }
}