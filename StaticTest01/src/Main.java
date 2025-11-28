//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Calcul
{
    public static double pi = 3.141592;


    static int plus(int x, int y) {return x+y;}
    public static int minus(int x, int y) {return x-y;}
}

public class Main {
    public static void main(String[] args) {

        double result = Calcul.pi;
        System.out.println(result);
        int result2 = Calcul.plus(5,10);
        int result3 = Calcul.minus(10,6);
        System.out.println(result2 + " " +result3);
    }
}