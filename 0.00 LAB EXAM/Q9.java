
class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square {

    double side;

    Square(double side) {
        this.side = side;
    }

    double getPerimeter() {
        return 4 * side;
    }
}

public class Q9 {

    public static void main(String[] args) {
        // Command-line arguments: Circle radius, Rectangle length and width, Square side
        double circleRadius = Double.parseDouble(args[0]);
        double rectLength = Double.parseDouble(args[1]);
        double rectWidth = Double.parseDouble(args[2]);
        double squareSide = Double.parseDouble(args[3]);

        Circle circle = new Circle(circleRadius);
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);
        Square square = new Square(squareSide);

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
