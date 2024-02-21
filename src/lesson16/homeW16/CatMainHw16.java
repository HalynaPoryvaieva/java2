package lesson16.homeW16;

import lesson16.Plate;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task1,Task2
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class CatMainHw16 {
    public static void main(String[] args) {
        CatHw16[] cats = {
                new CatHw16("Max",10),
                new CatHw16("Fox",10),
                new CatHw16("Tom",10)
        };
        Plate plate = new Plate(3);

        for (int i = 0; i < cats.length; i++) {
            CatHw16 cat = cats[i];
            cat.eat(plate);
            System.out.println(cat.eat(plate));
        }
        //Task2
        PetrolStation station=new PetrolStation(1000);
        Car car=new Car(10);
        System.out.println("Car:"+car.fuel);
        System.out.println("Station:"+station.fuel);

        car.refuel(station);
        System.out.println("Car:"+car.fuel);
        System.out.println("Station:"+station.fuel);
    }
}

