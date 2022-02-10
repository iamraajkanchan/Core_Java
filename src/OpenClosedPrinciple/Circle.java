package OpenClosedPrinciple;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle is " + (Math.PI * radius * radius));
    }
}
