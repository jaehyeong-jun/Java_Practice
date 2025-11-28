//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Calculator
{

    double areaRectangle(double width)
    {
        return width*width;
    }

    double areaRectangle(double width, double height)
    {
        return width * height;
    }

    public int minus(int a, int b)
    {
        return a-b;
    }
    public int plus(int a, int b)
    {
        return a+b;
    }
    public int multiple(int a, int b)
    {
        return a*b;
    }
    public double divide(int a, int b)
    {
        return (double)a / b;
    }

}

public class Main {
    public static void main(String[] args) {

        Calculator myCal = new Calculator();
        int width = 10;
        int height = 20;

        System.out.println("정사각형의 넓이 : " + myCal.areaRectangle(10));
        System.out.println("직사각형의 넓이 : " + myCal.areaRectangle(10,20));

    }
}