import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[3];
        int sum = 0;

        System.out.println("성적 입력");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("\n총점 : " + sum);
        System.out.printf("평균 : %.2f\n", average);
    }
}
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 입력 받기 위한 Scanner 객체 생성
        int[] scores = new int[3];  // 정수형 배열 선언 및 크기 3으로 초기화
        int sum = 0;  // 총점을 저장할 변수

        System.out.println("성적 입력");

        // 성적 3개 입력받기
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();  // 사용자로부터 정수 입력받음
            sum += scores[i];  // 입력값을 총점에 더함
        }

        double average = (double) sum / scores.length;  // 평균 계산 (소수점 포함)

        System.out.println("\n총점 : " + sum);
        System.out.printf("평균 : %.2f\n", average);  // 평균을 소수점 둘째 자리까지 출력

        scanner.close();  // Scanner 닫기
    }
}
