//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int[][] scores1 = new int[2][3];

        int[][] scores2 = {{1,2,3},{4,5,6}};

        for(int i = 0; i < scores1.length;i++)
        {
            for(int k = 0; k < scores1[0].length; k++)
            {
                scores1[i][k] = scores2[i][k];
            }
        }

        for (int[] ints : scores1) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}