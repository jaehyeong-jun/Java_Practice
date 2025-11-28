//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            arr[3] = 5;

            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("배열 초과 입력됨");
        } catch (Exception e) {
            System.out.println("에러발생");
        }

    }
}