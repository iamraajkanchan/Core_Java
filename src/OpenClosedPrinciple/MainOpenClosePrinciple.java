package OpenClosedPrinciple;

public class MainOpenClosePrinciple {
    public static void main(String[] args) {
        AreaCalculator.setShape(new Circle(4.5));
        AreaCalculator.calculate();
        AreaCalculator.setShape(new Square(4.0));
        AreaCalculator.calculate();
        AreaCalculator.setShape(new Rectangle(4.0, 5.0));
        AreaCalculator.calculate();
    }
}
