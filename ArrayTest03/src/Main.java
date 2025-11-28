//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "C";
        strArray[2] = new String("Python");

        System.out.println(strArray[0] == strArray[2]);

        for(String s : strArray)
        {
            System.out.println(s);
        }

    }
}