package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task1
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class Plate {
    int capacity;
    public int food;

    public Plate(int capacity) {
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

