package mx.tec;

public class OpenClosed {
    public static void main(String[] args) {
        System.out.println("Hello World");

        CalculateAreas ca = new CalculateAreas();
        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println("Area = " + ca.calculateArea(rectangle));

        Circle circle = new Circle(3);
        System.out.println("Area = " + ca.calculateArea(circle));
    }
}
