class Box<T>
{
    private T t;
    public T get(){
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class Apple{


}

public class Main<T> {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.setT(100);
        System.out.println(box.get());

        Box<Apple> box2 = new Box<Apple>();
        Apple apple = new Apple();
        box2.setT(apple);
        Apple apple2 = box2.get();

    }
}