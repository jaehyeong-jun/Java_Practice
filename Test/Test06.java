import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("당신의 성적을 입력하시오");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score>= 90){
            System.out.println("A학점입니다.");
        }else if(score>= 80){
            System.out.println("B학점입니다.");
        }else if(score>=70) {
            System.out.println("C학점입니다.");
        }else {
            System.out.println("D학점입니다.");
        }
    }
}