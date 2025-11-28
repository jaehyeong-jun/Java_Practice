class Box{
    private Object object;

    public Object get() {
        return object;
    }

    public void set(Object object) {
        this.object = object;
    }
}
class Apple{};

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        box.set("홍 킬 통");

        String name = (String)box.get();
        System.out.println(name);

        Apple apple = new Apple();
        box.set(apple);
        box.set(new Apple());
        Apple apple2 = (Apple)box.get();
        

    }
}