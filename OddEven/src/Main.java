import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        num = sc.nextInt();
        
        if(num%2==1)
        {
            System.out.println("홀수입니다.");
        }
        else if(num%2==0)
        {
            System.out.println("짝수입니다.");
        }
        else 
        {
            System.out.println("정수를 입력하세요");
        }
    }
}