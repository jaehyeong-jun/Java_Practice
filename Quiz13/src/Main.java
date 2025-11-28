class Calculator
{
    int plus(int s1, int s2)
    {
        return s1 +s2;
    }

    int minus(int s1, int s2)
    {
        return s1 -s2;
    }

    int multiply(int s1, int s2)
    {
        return s1 *s2;
    }

    double divide(int s1, int s2)
    {
        return (double)s1 /s2;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.plus(5,3));

        System.out.println(cal.minus(5,3));

        System.out.println(cal.multiply(5,3));

        System.out.printf("%.2f",cal.divide(5,3));

    }
}