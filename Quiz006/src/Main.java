import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요");
        int score = Integer.parseInt(sc.nextLine());

        if(score>=90 && score<100) System.out.println("A학점입니다.");
        else if(score>=80 && score<90) System.out.println("B학점입니다.");
        else if(score>=70 && score<80) System.out.println("C학점입니다.");
        else if(score>=60 && score<70) System.out.println("D학점입니다.");
        else System.out.println("F학점입니다.");
    }
}