abstract class Shape {
    String color;

    // Abstract method (no body)
    // abstract void draw();

    // Concrete method (has body)
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle shape1 = new Circle();
        shape1.draw();
    }
}
