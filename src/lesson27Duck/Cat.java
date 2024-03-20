package lesson27Duck;

import lesson27Duck.Jumpable;
import lesson27Duck.Runable;
import lesson27Duck.Swimable;

public class Cat implements CatAction {

    @Override
    public void jump() {
        System.out.println("Cat jump.");
    }

    @Override
    public void run() {
        System.out.println("Cat run.");
    }

    @Override
    public void swim() {
        System.out.println("Cat swim");
    }
}
