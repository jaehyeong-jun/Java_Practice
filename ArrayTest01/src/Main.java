import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int kor, eng, math;
        int[] score = new int[3];
        Scanner scanner = new Scanner(System.in);



        for(int i: score)
        {
            score[i] = scanner.nextInt();
        }
        for(int i: score)
        {
            System.out.println(score[i]);
        }
    }
}
