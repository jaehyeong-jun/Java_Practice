interface RemoteControl
{
    int MAX_VALUE = 100;
    int MIN_VALUE = 0;

    void turnOn();

    default void turnOff() {
    System.out.println("해당 제품의 전원을 끕니다.");
}
}

class TV extends Object implements RemoteControl
{
    @Override
    public void turnOn() {
        System.out.println("해당 제품의 전원을 켭니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.turnOn();
        myTV.turnOff();

    }
}