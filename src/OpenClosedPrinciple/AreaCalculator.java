package OpenClosedPrinciple;

public class AreaCalculator {
    static Shape shape;

    public static void setShape(Shape shape) {
        AreaCalculator.shape = shape;
    }

    public static void calculate() {
        AreaCalculator.shape.area();
    }
}
