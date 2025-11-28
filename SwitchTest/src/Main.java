import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요 :");
        num = sc.nextInt();

        switch (num)
        {
            case 0:
                System.out.printf("일요일");
                break;
            case 1:
                System.out.printf("월요일");
                break;
            case 2:
                System.out.printf("화요일");
                break;
            case 3:
                System.out.printf("수요일");
                break;
            case 4:
                System.out.printf("목요일");
                break;
            case 5:
                System.out.printf("금요일");
                break;
            case 6:
                System.out.printf("토요일");
                break;
            default:
                System.out.printf("error");
                break;
        }
        System.out.println("입니다");
    }
}