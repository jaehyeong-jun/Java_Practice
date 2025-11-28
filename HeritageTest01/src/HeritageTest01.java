public class HeritageTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        SuperCar sCar = new SuperCar();
        Car car2 = new SuperCar();
        //car2.boosterRun(); //Error
        SuperCar sCar2 = (SuperCar)car2;
        sCar2.boosterRun();
        ((SuperCar)car2).boosterRun();

    }
}
