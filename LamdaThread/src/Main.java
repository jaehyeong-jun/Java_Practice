class workThread implements Runnable{
    @Override
    public void run() {

        for(int i = 1; i<=100;i++)
        {
            System.out.println("전통식 : "+i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        //전통 스타일
        workThread t0 = new workThread();
        Thread t = new Thread(t0);
        t.start();


        //람다 스타일
        Thread t1 = new Thread(()->{
            for (int i = 1; i <=100; i++) {
                System.out.println("람다식 : "+i);
            }
        });

        t1.start();
    }
}