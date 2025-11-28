class A{
    static int max = 10;
}
abstract class b{
    public void method1()
    {

    }
}

class c extends b{
    @Override
    public void method1() {
        super.method1();
    }
}

interface RemoteControl{
    int MAX_VALUE = 10;
    public int MIN_VALUE = 0;
    void turnOn();
    void turnOff();
}
class TV implements RemoteControl{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

        
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(RemoteControl.MAX_VALUE);
        System.out.println(A.max);
    }
}