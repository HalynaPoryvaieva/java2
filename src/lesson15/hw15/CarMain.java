package lesson15.hw15;


/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 2
 *
 * @version 18-Feb-24
 *@author Halyna Poryvaieva
 */
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "gray", 4, 3);
        car.drive(3);
        System.out.println(car.drive(3));
    }
}
