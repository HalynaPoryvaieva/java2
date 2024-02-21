package lesson16.homeW16;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task1,Task2
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class PlateHw16 { int capacity;
    int food;

    public void Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public void add(int food) {
        //TODO check capacity
        this.food+=food;
    }

    public int amautFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food-= this.food;
    }
}
