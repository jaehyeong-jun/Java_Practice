public class Cat
{
    protected String name;
    protected int age;
    protected String color;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    Cat()
    {
        this.name = "Unknown";
        this.age = 0;
        this.color = "Unknown";
    }

    Cat(String name, String color)
    {
        this.name = name;
        this.age = 0;
        this.color = color;

    }

    Cat(String name, int age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void Meow()
    {
        System.out.println(name+"가 야옹거린다");
    }

    void Eat()
    {
        System.out.println(name+"가 밥을 먹는다");
    }
}