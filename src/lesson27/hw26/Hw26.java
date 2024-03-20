package lesson27.hw26;

public class Hw26 {
    public static void main(String[] args) {

        double sumArea = 0;
        double sumPerimeter = 0;
        Figure[] figures = {new Circle(5), new Triangle(5, 5, 5), new Rectangle(4, 5)};
        for (Figure figure : figures) {
            sumArea += figure.calcArea();
            sumPerimeter += figure.calcPerimeter();
            System.out.println(figure.calcArea());
        }
        System.out.println("allArea:" + sumArea + ",allPerimeter:" + sumPerimeter);
        System.out.println(Math.sqrt(-1));
        System.out.println(1. / 0);
    }
}
