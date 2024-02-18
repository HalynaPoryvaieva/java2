package lesson15.hw15;


/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 1
 *
 * @version 18-Feb-24
 *@author Halyna Poryvaieva
 */
public class Car {
    String name;
    String color;
    int gasoline;
    int distance;

    public Car(String name, String color, int gasoline, int distance) {
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
        this.distance = distance;
    }


    public void refuel() {
        this.gasoline++;
    }

    public void startEngine() {
        if (gasoline > 1) {
            System.out.println("No gas!");
            System.out.println("I need to refuel!");
            System.out.println("I am going to refuel");
            refuel();
            System.out.println("residual gasoline:" + gasoline);
            System.out.println("startEngine");
        }
    }

    public int drive(int distance) {
        startEngine();
        System.out.println();
        if (gasoline >= distance) {
            System.out.println("Car is driving");
            gasoline -= distance;
            System.out.println("residual gasoline:" + gasoline);
        } else {
            System.out.println("I need to refuel!");
            System.out.println("I am going to refuel");
            refuel();
        }
        return gasoline;
    }
}

