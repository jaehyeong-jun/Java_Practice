import java.util.Scanner;

class Calculator
{
    int plus(int s1, int s2)
    {
        return s1 + s2;
    }
    int minus(int s1, int s2)
    {
        return s1 - s2;
    }
    int mul(int s1, int s2)
    {
        return s1 * s2;
    }
    double devide(int s1, int s2)
    {
        return (double)s1 / s2;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요");
        int b = sc.nextInt();
        System.out.println("==========================");

        System.out.println("두 숫자를 합친 값은: "+cal.plus(a,b));
        System.out.println("두 숫자를 뺀 값은: "+cal.minus(a,b));
        System.out.println("두 숫자를 곱한 값은: "+cal.mul(a,b));
        System.out.println("두 숫자를 나눈 값은: "+cal.devide(a,b));
    }
}