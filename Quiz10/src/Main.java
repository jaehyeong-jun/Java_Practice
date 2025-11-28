class AlphaThread extends Thread
{
    @Override
    public void run() {

        for(char i = 'A'; i<='Z'; i++)
        {
            System.out.println(i);
        }
        System.out.println();
        for(char i = 'a'; i<='z'; i++)
        {
            System.out.println(i);
        }

    }
}

class NumberThread implements Runnable
{
    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        AlphaThread test1 = new AlphaThread();
        test1.start();

        NumberThread test2 = new NumberThread();
        Thread t = new Thread(test2);
        t.start();
    }
}