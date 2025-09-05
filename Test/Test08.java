//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args)
    {
        int cnt = 0;
        for(int i=2; i<=100; i++){
            for(int j=2; j<i; j++) {

                if(i%j == 0) {
                    cnt ++;
                    break;
                }
            }//
            if(cnt == 0)
                System.out.print(i+ "\t");
            cnt = 0;
        }






    }
}