package mx.tec;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        area = 3.14 * (radius * radius);
        return (area);
    }
}
