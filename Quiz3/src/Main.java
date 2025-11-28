//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        char temp = 'A';

        for(int i = 0; i <2 ; i++)
        {
            for(int k = 0; k < 26; k++)
            {
                System.out.print((temp)+" ");
                temp++;
            }
            System.out.println();
            temp = 'a';
        }
    }
}