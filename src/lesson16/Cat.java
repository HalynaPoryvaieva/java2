package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 16
 * @version 18-Feb-24
 * @author Halyna Poryvaieva
 */
public class Cat {
    int maxVolume;
    int realVolume;

    public Cat(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume=0;
    }
    public void eat(Plate plate){
        int food=plate.amautFood();
        if (food>maxVolume-realVolume){
            food=maxVolume-realVolume;
        }
        //TODO if cat eats all of food
       realVolume+=food;
       plate.decreaseFood(food);
    }
}
