import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width, height;

        double area;

        System.out.printf("width : " );
        width = Integer.parseInt(scanner.nextLine());

        System.out.printf("height : " );
        height = Integer.parseInt(scanner.nextLine());

        area = width * height / 2.0;
        System.out.println();
        System.out.println("area : " + area);



        //Q. 가로(width), 세로(height)를 입력받아 삼각형의 넓이(Area)를 구하는 프로그램 작성
    }
}