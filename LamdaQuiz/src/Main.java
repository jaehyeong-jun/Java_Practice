import java.util.Scanner;

interface MyInterface {

    public abstract int runMethod(int x, int y);
}

class A implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <=100; i++) System.out.println("c1 : "+i);
    }
}


public class Main {
    public static void main(String[] args) {

        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();


        Runnable runnable = () ->{
            for(int i = 1; i <=100; i++) System.out.println("c2 : "+i);
        };

        Thread t2 = new Thread(runnable);

        new Thread(()->{for(int i = 1; i <=100; i++) System.out.println("c3 =" +
                " "+ i);}).start();

        t2.start();
    }
}