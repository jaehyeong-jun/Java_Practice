class Shape {
    public void draw() {
        System.out.println("도형을 그리다.");
    }

}

class Rectangle extends Shape {

    public void draw() {
        super.draw();
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("원을 그리다");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("삼각형을 그리다");
        ;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();

        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        Triangle tri = new Triangle();

        s.draw();
        rec.draw();
        cir.draw();
        tri.draw();

    }
}