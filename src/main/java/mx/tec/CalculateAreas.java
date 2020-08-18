package mx.tec;

public class CalculateAreas {
    private double area;

    public double calculateArea(Shape shape) {
        area = shape.getArea();
        return area;
    }
}
