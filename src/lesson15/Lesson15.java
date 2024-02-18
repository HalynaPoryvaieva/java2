package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 2
 *
 * @version 18-Feb-24
 *@author Halyna Poryvaieva
 */
public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat("Max", "white", 3, 10, 4);
        cat.voice();
        System.out.println(cat.name + "," + cat.color + "age:" + cat.age + "volume:" + cat.volume + "energy:" + cat.energy);

        Cat cat1 = new Cat("Ted", "white", 7, 10, 3);
        cat1.voice();
        System.out.println(cat1.name + "," + cat1.color + "," + cat1.age + "volume:" + cat.volume + "energy:" + cat.energy);
        cat1.eat(5);
        System.out.println(cat1.satisfied());
        System.out.println("___________________________");
        cat.walk();
        System.out.println(cat.walk());
        System.out.println("___________________________");
        cat1.run();
        System.out.println(cat1.run());
    }
}
