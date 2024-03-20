package lesson29.hw28;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw28,Task2
 * @version 20-Mar-24
 * @author Halyna Poryvaieva
 */
public class BicycleShop {

    private String model;
    private int weight;

    private int seatPostDiameter;

    public BicycleShop(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;

    }

    public void start() {
        System.out.println("Let's go!");
    }

    public class Seat {

        public void up() {

            System.out.println("The seat is raised higher!");
        }

        public void down() {

            System.out.println("The seat is lowered!");
        }

        public void getSeatParam() {

            System.out.println("Seat parameter: seat post diameter = " + BicycleShop.this.seatPostDiameter);
        }
    }
}
