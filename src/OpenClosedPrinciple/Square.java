package OpenClosedPrinciple;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Area of Square is " + (4 * length));
    }
}
