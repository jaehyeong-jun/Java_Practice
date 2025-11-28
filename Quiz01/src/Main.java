import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("b : ");
        b = Integer.parseInt(sc.nextLine());

        System.out.println("변경 전 A : " + a + ", B : " + b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("변경 후 A : " + a + ", B : " + b);
    }
}