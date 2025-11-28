class AThread extends Thread
{
    @Override
    public void run() {
        System.out.println("현재 스레드의 이름 : " + Thread.currentThread().getName());
        for(int i = 1; i <=1000; i++)
        {
            System.out.print(i + " ");
        }
    }
}

class BThread implements Runnable
{
    @Override
    public void run() {
        System.out.println("현재 스레드의 이름 : " + Thread.currentThread().getName());
        for(char ch = 'a'; ch <='z'; ch++)
        {
            System.out.print(ch+" ");
        }
    }
}


public class Main {
    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println("현재 스레드의 이름 : "+ name);

        AThread at = new AThread();
        at.start();

        BThread bt = new BThread();
        Thread t = new Thread(bt);
        t.start();
    }
}