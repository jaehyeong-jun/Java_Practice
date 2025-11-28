class A extends Object
{
    public A(){}

    @Override
    public String toString() {
        return "Wow! friends! Ore wa kinda";
    }

    @Override
    public int hashCode() {
        return 500;
    }
}

public class Main extends Object {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        
        Main m = new Main();
        System.out.println(m.toString());
        System.out.println(m.hashCode());
        
    }
}