package lesson25.lesson25hw.Task3;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(radius);
    }
}
