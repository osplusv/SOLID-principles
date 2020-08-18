package mx.tec;

public class OutputAreas {
    private double areas = 0;

    public OutputAreas(double areas) {
        this.areas = areas;
    }

    public void console() {
        System.out.println("Total of all areas = " + areas);
    }

    public void HTML() {
        System.out.println("<HTML>");
        System.out.println("Total of all areas = " + areas);
        System.out.println("</HTML>");
    }
}
