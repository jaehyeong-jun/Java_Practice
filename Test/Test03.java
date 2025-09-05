import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("0~6까지 원하는 숫자를 1개 입력하시오");
        number = sc.nextInt();

        switch(number) {
            case 0:
                System.out.println("월요일");
                break;
            case 1:
                System.out.println("화요일");
                break;
            case 2:
                System.out.println("수요일");
                break;
            case 3:
                System.out.println("목요일");
                break;
            case 4:
                System.out.println("금요일");
                break;
            case 5:
                System.out.println("토요일");
                break;
            case 6:
                System.out.println("일요일");
                break;
//              문자열로할때
//            String strValue;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("0~6까지 원하는 숫자를 1개 입력하시오");
//            strValue = sc.next();
//
//            switch(strValue) {
//                case "0":
//                    System.out.println("월요일");
//                    break;
//                case "1":
//                    System.out.println("화요일");
//                    break;
//                case "2":
//                    System.out.println("수요일");
//                    break;
//                case "3":
//                    System.out.println("목요일");
//                    break;
//                case "4":
//                    System.out.println("금요일");
//                    break;
//                case "5":
//                    System.out.println("토요일");
//                    break;
//                case "6":
//                    System.out.println("일요일");
//                    break;
        }


    }


}