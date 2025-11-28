
public class Main {
    public static void main(String[] args) {

        MyInterface mi;
        mi = () -> {
            System.out.println("hello world");
        };

//        mi.method();

        mi = () ->{
            System.out.println("method call 2");
        };
//        mi.method();

        mi = () -> System.out.println("method call 3");
        mi.method();

    }
}