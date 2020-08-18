package mx.tec;

public class CalculateAreas {
    private double area;

    public double calculateArea(Rectangle rectangle) {
        area = rectangle.length * rectangle.width;
        return area;
    }
}
