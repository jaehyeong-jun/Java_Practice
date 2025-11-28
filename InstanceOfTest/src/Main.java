class Vehicle{};
class Bus extends Vehicle{}
class Taxi extends Vehicle{}
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        if(bus instanceof Vehicle){
            System.out.println("둘이 같은 타입 입니다.");
        }
        else{
            System.out.println("다른 타입 입니다.");
        }
    }
}