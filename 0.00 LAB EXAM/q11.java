import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle {

    int length, breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

class Square {

    int side;

    Square(int s) {
        this.side = s;
    }

    public int getArea() {
        return side * side;
    }
}

class Circle {

    int radius;

    Circle(int r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Q11 {

    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the rectangle: ");
        int length = Integer.parseInt(b.readLine());

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = Integer.parseInt(b.readLine());

        Rectangle r = new Rectangle(length, breadth);
        System.out.println("Area of the rectangle is: " + r.getArea());

        System.out.print("Enter the side of the square: ");
        int side = Integer.parseInt(b.readLine());

        Square s = new Square(side);
        System.out.println("Area of the square is: " + s.getArea());

        System.out.print("Enter the radius of the circle: ");
         int radius = Integer.parseInt(b.readLine());

        Circle c = new Circle(radius);
        System.out.println("Area of the circle is: " + c.getArea());
    }
}
