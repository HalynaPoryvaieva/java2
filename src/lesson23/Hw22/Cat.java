package lesson23.Hw22;

import lesson23.Hw22.Animal;

public class Cat extends Animal {


    public Cat(int age) {
        super(age);
    }

    @Override
    public String voice() {
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
