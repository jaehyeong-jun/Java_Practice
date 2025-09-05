import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();

        for(int i=0; i<6; i++) {
            int num = (random.nextInt(45)) + 1;

            System.out.print(num);
            System.out.print(" ");
        }
        int bonus = (random.nextInt(45)) + 1;
        System.out.println("");
        System.out.println("보너스 번호: "+ bonus);




    }
}