import java.util.ArrayList;

class Animal{
    void makeSound(){
        System.out.println("");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("야옹!");
    }
}

class Cow extends Animal{
    @Override
    void makeSound() {
        System.out.println("음메~");
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<>();

        Animal animal = new Dog();
        list.add(animal);
        animal = new Cat();
        list.add(animal);
        animal = new Cow();
        list.add(animal);
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Cow cow = new Cow();
//
//        list.add(dog);
//        list.add(cat);
//        list.add(cow);

        for(Animal ani : list)
        {
            ani.makeSound();
        }

    }
}