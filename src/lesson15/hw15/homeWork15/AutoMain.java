package lesson15.hw15.homeWork15;

import lesson15.hw15.Car;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto=new Auto(5,30);
        if(auto.startEngine()){
            System.out.println(auto.drive(50));
        }
    }
}
