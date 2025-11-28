import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int[] scores = new int[3];
        String[] subject = {"국어","수학","영어"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("성적 입력");
        for(int i = 0 ; i< scores.length; i++)
        {

            scores[i] = scanner.nextInt();
        }

        int sum = scores[0] + scores[1] + scores[2];

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f", (double)sum/3);
    }
}