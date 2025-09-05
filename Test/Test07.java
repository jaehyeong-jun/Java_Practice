import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("문자열을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int CntBig = 0;  // 대문자
        int cntSmall = 0;  // 소문자
        int cntNumber = 0;  // 숫자
        int cntSpecial = 0;  // 특수문자

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) { // 대문자
                CntBig++;
            } else if (Character.isLowerCase(ch)) {
                cntSmall++;
            } else if (Character.isDigit(ch)) {
                cntNumber++;
            } else {
                cntSpecial++;
            }
        }

        System.out.println("대문자 : " + CntBig);
        System.out.println("소문자 : " + cntSmall);
        System.out.println("숫자 : " + cntNumber);
        System.out.println("특수문자 : " + cntSpecial);
    }
}