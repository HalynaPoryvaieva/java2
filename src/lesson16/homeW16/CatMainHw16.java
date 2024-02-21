package lesson16.homeW16;

import lesson16.Plate;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw16,Task1
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
        Plate plate = new Plate(5);

        for (int i = 0; i < cats.length; i++) {
            CatHw16 cat = cats[i];
            cat.eat(plate);
            System.out.println(cat.eat(plate));
        }
    }
}

