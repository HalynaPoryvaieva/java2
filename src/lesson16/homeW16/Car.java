package lesson16.homeW16;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task2
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class Car {
    double maxFuel;
    double fuel;

    public Car(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void refuel(PetrolStation station){
        double toGet = station.decreaseFuel(maxFuel-fuel);
        fuel+=toGet;
    }
}
