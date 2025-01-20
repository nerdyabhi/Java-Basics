package shape;

public class Figure {

    // Method to compute the volume of a cube
    public double volume(double side) {
        return side * side * side;
    }

    // Method to compute the volume of a cylinder
    public double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to compute the volume of a rectangular box
    public double volume(double length, double width, double height) {
        return length * width * height;
    }
}
