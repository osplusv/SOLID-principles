package mx.tec;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calcArea() {
        area = side * side;
        return area;
    }
}
