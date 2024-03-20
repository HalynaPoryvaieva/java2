package lesson27.hw26;

import lesson27.hw26.Figure;

public class Rectangle extends Figure {

    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public double calcPerimeter() {
        return (a + b) * 2;
    }
}
