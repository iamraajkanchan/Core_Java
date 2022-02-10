package OpenClosedPrinciple;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is " + (length * width));
    }
}
