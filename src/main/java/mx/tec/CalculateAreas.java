package mx.tec;

public class CalculateAreas {
    private Shape[] shapes;
    private double sumTotal = 0;

    public CalculateAreas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double sumAreas() {
        sumTotal = 0;

        for (Shape shape : shapes) {
            sumTotal = sumTotal + shape.calcArea();
        }

        return sumTotal;
    }
}
