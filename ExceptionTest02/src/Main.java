//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void findClass1() throws ClassNotFoundException {
            Class clazz = Class.forName("java.lang.Math7");

    }

    public static void findClass2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Math7");

    }

    public static void main(String[] args) {


        try {
            findClass1();
            findClass2();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 찾지 못함");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}