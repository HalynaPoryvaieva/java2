package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 16
 * @version 18-Feb-24
 * @author Halyna Poryvaieva
 */
public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat(30);
        Plate plate=new Plate(50);
        System.out.println(cat.realVolume);
        System.out.println(plate.food);

        plate.add(20);
        cat.eat(plate);
        //plate.feeding(plate);
        System.out.println(cat.realVolume);
        System.out.println(plate.food);
    }
}
