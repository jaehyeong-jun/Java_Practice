import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("단을 입력해 주쎄요 : ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = {2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        for(int i: arr1)
        {
            for(int k: arr2) {
                System.out.println(i+" x "+k+" = "+k*i +"입니다.");
            }
        }

//        String str = "Java, Programming, Well";
//
//        char n1 = str.charAt(7);
//        int n2 = str.length();
//        String str2 = str.replace("Well", "Good");
//        String arr = str.substring(5);
//        int n3 = str.indexOf("Programming");
//        String[] arr2 = str2.split(",");
//
//        System.out.println(n1 + " / " +n2 + " / " + str + " / " + str2 + " / " + arr);
//        System.out.println(str2 + " / " +n3 + " / " + arr2[0] + " / " +arr2[1]+ " / " + arr2[2]);


    }
}