import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("행/열의 길이 입력");
        Scanner sc = new Scanner(System.in);
        int MAX = sc.nextInt();

        int state = 0;
        int[][] snail = new int[MAX][MAX];
        int column = MAX-1;
        int row = 0;



        for(int i = 1; i <= MAX*MAX; i++)
        {
            if(state == 0)
            {
                snail[column][row] = i;
                if( row == MAX-1 || snail[column][row+1]!=0)
                {
                    state++;
                    column--;
                }
                else{
                    row++;
                }
            }
            else if(state ==1)
            {
                snail[column][row] = i;
                if( column == 0 || snail[column-1][row]!=0)
                {
                    state++;
                    row--;
                }
                else{
                    column--;
                }

            }
            else if(state ==2)
            {
                snail[column][row] = i;
                if( row == 0 || snail[column][row-1]!=0)
                {
                    state++;
                    column++;
                }
                else{
                    row--;
                }
            }
            else if(state ==3)
            {
                snail[column][row] = i;
                if( column == MAX-1 || snail[column+1][row]!=0)
                {
                    state = 0;
                    row++;
                }
                else{
                    column++;
                }
            }
            else
            {
                System.out.println("error");
                return;
            }



        }

        for(int j = MAX-1; j >= 0; j--)
        {
            for(int l = 0; l < MAX; l++)
            {
                System.out.print(snail[j][l]+ "\t");
            }
            System.out.println();
        }
    }
}