abstract class Mammal{
    abstract public void eat();
}

interface Flyable{
    void fly();
}

interface Runnable{
    void run();
}

class A {

}

class Lion extends Mammal implements Flyable, Runnable{

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
}

class Tiger extends Mammal {
    @Override
    public void eat() {

    }
}
public class Main {
    public static void main(String[] args) {


    }
}