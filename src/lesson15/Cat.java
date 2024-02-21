package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 1
 * @version 18-Feb-24
 * @author Halyna Poryvaieva
 */
public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;
    int energy;


    public Cat(String name, String color, int age, int volume, int energy) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
        this.energy = energy;
    }

    public Cat(int i) {
    }

    public void eat(int food) {
        this.food+= food;
    }

    public double satisfied() {
        return (double) food / volume * 100;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public void energy() {
       energy ++;
    }

    public int walk() {
        if (energy >= 3) {
            System.out.println("I go");
            energy -= 3;
            System.out.println("Energy:" + energy);
        } else {
            System.out.println("Lack of energy!");
            System.out.println("I am going to eat");
            eat(3);
            System.out.println("I go");
            System.out.println("residual energy:" + energy);
        }
        return energy;
    }

    public int run() {
        if (energy >= 5) {
            System.out.println("I run");
            energy -= 5;
            System.out.println("Energy:");
        } else {
            System.out.println("Lack of energy!");
            System.out.println("I am going to eat");
            eat(5);
            System.out.println("I run");
            System.out.println("residual energy:"+energy);
        }
        return energy;
    }
}