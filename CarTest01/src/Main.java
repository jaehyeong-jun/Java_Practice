//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Car
{
    String model;
    int speed;

    Car(String model)
    {
        this.model = model;
    }

    void setSpeed(int speed)
    {
        this.speed = speed;
    }

    void run()
    {
        this.setSpeed(100);
        System.out.println(this.model);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}