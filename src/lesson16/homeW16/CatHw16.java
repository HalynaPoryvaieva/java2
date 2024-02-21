package lesson16.homeW16;

import lesson16.Plate;

import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task1
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class CatHw16 {
    String name;
    int maxVolume;
    int realVolume;
    int cat[];
    int appetit;

    public CatHw16(String name) {
        this.name = name;
    }

    public CatHw16(String name, int maxVolume, int realVolume, int[] cat, int appetit) {
        this.name = name;
        generateAppetite(10);
    }

    public int generateAppetite(int appetite) {
        Random random = new Random();
        appetite = random.nextInt(10);
        System.out.println(appetite);
        return appetite;
    }

    public void eat(Plate plate) {
        int food = plate.amautFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        //TODO if cat eats all of food
        realVolume += food;
        plate.decreaseFood(appetit);
    }
}


