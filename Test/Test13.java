import java.util.ArrayList;


class Animal{       //부모 클래스
    void makeSound(){
        System.out.println("");
    }
}

class Dog extends Animal{       // 자식 클래스
    @Override
    void makeSound() {
        System.out.println("월월!");
    }
}

class Cat extends Animal{       // 자식 클래스
    @Override
    void makeSound() {
        System.out.println("먀아오");
    }
}

class Cow extends Animal{       // 자식 클래스
    @Override
    void makeSound() {
        System.out.println("음메~");
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<>();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        list.add(dog);
        list.add(cat);
        list.add(cow);

        for(Animal animal : list)
        {
            animal.makeSound();
        }

    }
}