public class Main {

    public static void myPrint(){
        System.out.println("Hello World1!");
    }
    public void myPrint2(){
        System.out.println("Hello World2!");
    }
    public byte func1(){
        System.out.println("func1");
        return 5;
    }
    public int func2(int value){
        System.out.println("func2");
        return value +1;
    }

    public static void main(String[] args) {

        myPrint();
        Main m = new Main();
        m.myPrint2();
        System.out.println(m.func1());
        System.out.println(m.func2(1));
    }
}