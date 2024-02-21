package lesson15.hw15.homeWork15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 15,Hw 15,Task 1
 *
 * @version 19-Feb-24
 *@author Halyna Poryvaieva
 */
public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.status());
        cat.eat(10);
        cat.walk();
        cat.run();
        System.out.println(cat.status());
        cat.walk();
        System.out.println(cat.status());
        Cat newCat=new Cat();
        System.out.println(newCat.status());
    }
}
