package lesson29.hw28;

import lesson29.hw28.Bicycle;
import lesson29.hw28.BicycleShop;

public class Hw28 {
    public static void main(String[] args) {

        //Task1
        Bicycle peugeot = new Bicycle("Peugeot", 120);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        System.out.println("-------------------------");

        //Task2
        BicycleShop bicycleShop = new BicycleShop("Peugeot", 120, 40);
        BicycleShop.Seat seat1 = bicycleShop.new Seat();

        seat1.getSeatParam();
    }
}
