class RemoteControl
{

}
interface A {}
interface B {}
class ClassA {}
class ClassB {}

class Test extends ClassA implements A, B{

}

public class Main extends ClassB implements A,B{
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(){
            public void turnOn(){
                System.out.println("전원을 켜다.");
            }
            public void turnOff(){

            }
        };
    }
}