//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Car{
    String color;
    int speed;
    String brand;

    Car(int speed, String color, String brand)
    {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
    }

    Car()
    {
        this.speed = 80;
        this.color = "Blue";
        this.brand = "기아";
    }


    void sign() {
        System.out.println("빵빵");
    }
    void Run()
    {
        System.out.println("run in "+this.speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car sonata = new Car(100, "Red", "현대");
        Car g80 = new Car();

        sonata.Run();
        g80.Run();
        System.out.println(g80.color);
    }
}