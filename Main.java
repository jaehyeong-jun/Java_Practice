import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    public static void main(String[] args)
    {
        int[] score = new int[3]; //자바 배열선언
        int sum = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("영어, 국어, 수학 순으로 점수를 입력해 주세요.");
        for(int i=0; i<3; i++) {
            score[i] = sc.nextInt();
            sum += score[i];  // <------ sum = sum + score[i];
        }
        avg = (double)sum / 3.0;
        System.out.println("총점 : "+ sum);
        System.out.printf("평균 : %.2f", avg);
/*
        int [] score = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("영어 점수를 입력하세요");
        score[0] = sc.nextInt();
        System.out.println("국어 점수를 입력하세요");
        score[1] = sc.nextInt();
        System.out.println("수학 점수를 입력하세요");
        score[2] = sc.nextInt();

        int sum = score[0] + score [1] + score[2];
        double avg = sum / 3.0;

        System.out.println("세 과목의 합계: "+ sum);
        System.out.println("세 과목의 평균: "+ avg);
*/

    }
}