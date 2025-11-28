import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("문자열을 입력하세요");

        String str = sc.nextLine();

        int lowAlpha = 0;
        int highAlpha = 0;
        int num = 0;
        int specific = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i)>='a') && (str.charAt(i)<='z'))
            {
                lowAlpha++;
            }
            else if ((str.charAt(i)>='A') && (str.charAt(i)<='Z'))
            {
                highAlpha++;
            }
            else if ((str.charAt(i)>='0') && (str.charAt(i)<='9'))
            {
                num++;
            }
            else
            {
                specific++;
            }
        }

        System.out.println("알파벳 대문자 : " + highAlpha);
        System.out.println("알파벳 소문자 : " + lowAlpha);
        System.out.println("숫자 : " + num);
        System.out.println("특수문자 : " + specific);

    }
}