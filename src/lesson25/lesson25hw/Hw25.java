package lesson25.lesson25hw;

import lesson25.lesson25hw.Task3.Circle;
import lesson25.lesson25hw.Task3.Figure;
import lesson25.lesson25hw.Task3.Squer;
import lesson25.lesson25hw.lesson26HwTask2.*;

public class Hw25 {
    public static void main(String[] args) {
        //Task1
        Human[] humans={new Human(10,15),new NoProfRunner(15,10), new ProRunner(25,5)};
       for (Human human:humans){
           System.out.println(human.run());
       }
       //Task2
        Vehicle[] vehicles={new Car(),new Bicycle(),new ElectroBike(),new Motorcycle()};
       for (Vehicle v:vehicles){
           System.out.println(v.startEngine());
       }
       //Task3

        Figure[] figures={new Circle(5),new Squer(5)};
        for (Figure figure:figures){
            System.out.println(figure.calcArea());
        }

    }
}
