public class Car
{
    //1.멤버 변수
    String name;
    int age;
    String color;
    //2.생성자 =객체 초기화
    Car()
    {
        this.name = "자동차";
        this.age = 3;
        this.color = "빨간색";
    }
    Car(String name)
    {
        this.name = name;
        //this.color = "누런색";
    }
    Car(int age, String name, String color)
    {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    //3.멤버 메소즈
    String Run()
    {
        return"달리다";
    }
    String Stop()
    {
        return"멈추다";
    }
    String Back()
    {
        return"후진하다!!!";
    }
}