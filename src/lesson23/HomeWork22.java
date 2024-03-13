package lesson23;

import lesson23.Hw22.Animal;
import lesson23.Hw22.Cat;

public class HomeWork22 {
    public static void main(String[] args) {
        Animal animal=new Animal(5);
        System.out.println(animal);
        System.out.println(animal.voice());

        Cat cat=new Cat(3);
        System.out.println(cat);
        System.out.println(cat.voice());
    }
}
