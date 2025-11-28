//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

//        String temp;
//        String str1 = "Java Programming";
//        String newstr = str1.replace("Java", "자바");
//
//        System.out.println("문자열 길이 : " + str1.length());
//
//        for (int i = 0; i < newstr.length(); i++)
//        {
//            System.out.println(newstr.charAt(i));
//        }
//
//        System.out.println(str1.charAt(0));

        String str3 = "991225-1234567";
        System.out.println(str3.substring(2,6));
        String[] str4 = str3.split("-");
        System.out.println(str4[0]);

    }
}