//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("java.lang.math");
            System.out.println("정상 수행 되었음");
        } catch (ClassNotFoundException ex) {
            System.out.println("class not found");
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("응 무조건 실행이야");
        }
    }
}