public class Dog {

    String name;
    int age;
    String sex;

    Dog()
    {
        this.name = "Dog";
        this.age = 0;
        this.sex = "Unknown";
    }

    Dog(String name, String sex, int age)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void bark()
    {
        System.out.println("왈왈");
    }
    void run()
    {
        System.out.println("슈웅");
    }
    void profile()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}

class Fome extends Dog{

    Fome()
    {
        this.name = "Fome";
        this.age = 5;
        this.sex = "Male";
    }

    void bark()
    {
        System.out.println("와왕");
    }

}