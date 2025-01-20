
class Circle {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}

class Rectangle {

    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}


class Square{

    int side;

    Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

class Q10 {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area of circle is : " + c1.getArea());//c1.getArea();
    }
}
