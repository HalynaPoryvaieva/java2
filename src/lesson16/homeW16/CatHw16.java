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
    int realVolume;
    int maxVolue;
    int appetit;

    public CatHw16(String name, int realVolume, int maxVolue, int appetit) {
        this.name = name;
        this.realVolume = realVolume;
        this.maxVolue = maxVolue;
        this.appetit = appetit;
    }

    public int eat(Plate plate) {
        int food = plate.amautFood();
        if (food > food - realVolume) {
            food = food - realVolume;
        }
        //TODO if cat eats all of food
        realVolume += food;
        plate.decreaseFood(food);
        return food;
        //Task2

    }
}


