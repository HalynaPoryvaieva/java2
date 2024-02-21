package lesson15.hw15.homeWork15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 1
 *
 * @version 19-Feb-24
 *@author Halyna Poryvaieva
 */
public class Cat {

    int energy;

    public void walk() {
        if (energy<3){
            voice();
            return;
        }
        energy -= 3;
    }

    public void run() {
        if (energy<5){
            voice();
            return;
        }
        energy -= 5;
    }

    public void eat(int food) {
        energy += food;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public int status() {
        return energy;
    }
}
