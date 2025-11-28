import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr = new int[]{0,0,0,0,0,0,0};

        Random random = new Random();

        int num;

        for(int i = 0; i < arr.length; i++)
        {
            num = (random.nextInt(45))+1;

            while(true) {       //중복검사
                int check = 0;
                for (int k = 0; k < i; k++) {
                    if (arr[k] == num) {
                        num = (random.nextInt(45)) + 1;
                        check = 1;
                    }
                }
                if(check == 0) break;
            }

            if(arr[i] == 0)
            {
                arr[i] = num;
            }
        }

        System.out.print("로또번호 : ");
        for(int j = 0; j < 6 ; j++)
        {
            System.out.print(arr[j]+" ");
        }

        System.out.print("\n보너스 번호 : " + arr[6]);

    }
}