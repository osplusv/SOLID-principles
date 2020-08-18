package mx.tec;

public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println("Area = " + rectangle.calcArea());

        Square square = new Square(2);
        System.out.println("Area = " + square.calcArea());
    }
}
