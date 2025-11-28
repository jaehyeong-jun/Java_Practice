class A {
    //중첩 클래스(B)
    class B {

        int field = 123;
        static int field0 = 234;

        void shout() {
            System.out.println("shout");
        }
    }

    static class C {
        int field1;
        static int field2;
        C() {
            System.out.println("객체가 생성됨");
        }
        void method(){
            System.out.println("정적 멤버 클래스의 method();");
        }
    }

    void method() {
        class D {
            D(){
                System.out.println("D 로컬 클래스의 생성자 실행");
            }
            int field1;
            void method(){
                System.out.println("로컬 클래스의 생성자 실행");
            };

            // 메서드 내 클래스는 static 선언 불가. static int field2;
        } // end of D

        D d = new D();
        d.field1 = 3;
        d.method();
    }   // end of method
}   //end of A class

public class Main {
    public static void main(String[] args) {
        A a = new A();
        //중첩 클래스 생성
        A.B b = a.new B();

        b.field = 100;
        A.B.field0 = 200;

        //전역 멤버 클래스 생성
        A.C c = new A.C();

        b.shout();
        System.out.println(b.field);

        c.field1 = 2000;
        System.out.println(c.field1);
        A.C.field2 = 3000;

        a.method();
    }
}