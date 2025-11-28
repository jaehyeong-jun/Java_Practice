class Car
{
    int age;
    int speed;
    String number;
    String color;
    String brand;


    Car()
    {
        this.age = 0;
        this.speed = 100;
        this.number = "00바 0000";
        this.color = "Unknown";
    }

    Car(int speed, String brand)
    {
        this.speed = speed;
        this.brand = brand;
    }

    void Run()
    {
        System.out.println(speed+"의 속도로 달린다");
    }

    void repeat(String name)
    {
        System.out.println(name+"한테 반갑다고 인사합니다.");
    }
}

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {

        Car dori = new Car();
        dori.Run();
        dori.repeat("김민수");


        Car myCar = new Car(100, "BMW");
        myCar.Run();
        System.out.println("자동차 스피드 : " + myCar.speed);
        System.out.println("자동차 브랜드 : " + myCar.brand);
    }




}