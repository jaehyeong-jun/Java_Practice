class Horse{
    public void run(){
        System.out.println("말처럼 달리다");
    }
}
interface IWing{
    public void fly();
}
interface IVersion1{

}
interface IVersion2{}

class Unicon extends Horse implements IWing, IVersion1{
    @Override
    public void run() {
        System.out.println("유니콘 달리다");
    }

    @Override
    public void fly() {
        System.out.println("유니콘 날다");
    }
}
public class Main {
    public static void main(String[] args) {
        Unicon unicon = new Unicon();
        unicon.run();
        unicon.fly();

    }
}