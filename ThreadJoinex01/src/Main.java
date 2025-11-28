class sumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for(int i = 0; i <=100; i++)
        {
            sum +=i;
        }
    }
}

public class Main {
    public static void main(String[] args){


        sumThread th = new sumThread();
        th.start();

        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("1 ~ 100까지의 합 : "+th.getSum());

    }
}