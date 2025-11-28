//자식 클래스의 무분별한 상속을 제한하고 싶다.
sealed class Person permits Employee, Manager{

}
non-sealed class Employee extends Person{

}
class A extends Employee{   // Employee를 final로 했기 때문에 선언 불가

}

final class Manager extends Person{

}


public class Main {
    public static void main(String[] args) {
        A a = new A();
    }
}