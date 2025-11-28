class Car {
    protected String brand;
    protected int speed;
    protected String color;

    public Car() {
        System.out.println("Car() 생성자 호출");
    }
    public void run() {
        System.out.println("달리다.");
    }
}
class SuperCar extends Car{
    public SuperCar() {
        System.out.println("SuperCar() 생성자 호출");

    }
    //은닉화.
    @Override
    public void run() {
        super.run();
    }
    public void boosterRun() {
        System.out.println("부스터를 이용해 달리다.");
    }
}


