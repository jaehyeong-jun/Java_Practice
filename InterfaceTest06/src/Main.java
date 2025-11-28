interface Vehicle{
    void run();
}
interface Vehicle2{
    void run();
}
class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}
class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver{
    public void drive(Vehicle v){
        v.run();
    }
}

public class Main {
    public static void main(String[] args) {

        Driver tom = new Driver();
        Bus bus1 = new Bus();
        Taxi taxi1 = new Taxi();
        tom.drive(taxi1);
    }
}