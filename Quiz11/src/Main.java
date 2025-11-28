import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] score = new int[3];
        String[] subject = new String[]{"영어", "국어", "수학"};

        int sum = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);

        for(int k = 0; k < 3; k++)
        {
            System.out.print(subject[k] + "점수 : ");
            score[k] = sc.nextInt();
        }


//        System.out.print("영어 점수 : ");
//        score[0] = sc.nextInt();
//
//        System.out.print("국어 점수 : ");
//        score[1] = sc.nextInt();
//
//        System.out.print("수학 점수 : ");
//        score[2] = sc.nextInt();

        for(int i : score)
        {
            sum += i;
        }

        avg = (double)sum / score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : %.2f" + avg);



    }
}