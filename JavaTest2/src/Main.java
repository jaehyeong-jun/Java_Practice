import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

class Cal
{
    Cal(int num1, int num2)
    {

    }
    public int plus(int input1, int input2)
    {
        return (input1+input2);
    }
    public int minus(int input1, int input2)
    {
        return (input1-input2);
    }
    public int multi(int input1, int input2)
    {
        return (input1*input2);
    }
    public double divide(int input1, int input2)
    {
        if(input2 == 0) return 0;
        return ((double)input1/(double)input2);
    }
}

public class Main {
    // +, -, *, /



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("num1 입력");
        num1 = scanner.nextInt();
        System.out.println("num2 입력");
        num2 = scanner.nextInt();

        Cal calculator = new Cal(num1, num2);

        System.out.println("plus :" + calculator.plus(num1,num2));
        System.out.println("minus :" + calculator.minus(num1,num2));
        System.out.println("multifly :" + calculator.multi(num1,num2));
        System.out.println("divide :" + calculator.divide(num1,num2));


    }
}