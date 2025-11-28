class AlphaThread extends Thread
{
    @Override
    public void run() {
        for(char i = 'A'; i <= 'Z'; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i = 'a'; i <= 'z'; i++)
        {
            System.out.print(i + " ");
        }
    }
}

class NumberThread implements Runnable
{
    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.print(i + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AlphaThread at = new AlphaThread();
        at.start();

        NumberThread at2 = new NumberThread();
        Thread t = new Thread(at2);
        t.start();

    }
}