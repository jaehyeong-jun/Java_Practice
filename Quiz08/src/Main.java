public class Main {
    public static void main(String[] args) {

        int cnt;
        for(int i = 2; i <=100 ; i++)
        {   cnt = 0;
            for(int j = 2; j <= i; j++)
            {
                if(i % j == 0) {
                    cnt++;
                }

                if(cnt >=2){
                    break;
                }
            }
            if(cnt <2)
            {
                System.out.print(i + " ");
            }
        }

    }
}