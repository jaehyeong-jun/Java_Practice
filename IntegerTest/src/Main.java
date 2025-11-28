import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int num = 10;
        Integer boxedNum = Integer.valueOf(num);
        Integer autoBoxingNum1 = num;

        Integer obj = Integer.valueOf(20);
        int unboxNum = obj.intValue();
        int autoUnboxNum = obj;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);

        System.out.println(list);
    }
}