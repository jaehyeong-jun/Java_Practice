import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] score = new int[3];

        int total = 0;
        double avg;

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 3 ; i ++)
        {
            score[i] = sc.nextInt();
            total += score[i];
        }

        avg = (double)total / 3.0;

        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f" ,avg);
    }
}