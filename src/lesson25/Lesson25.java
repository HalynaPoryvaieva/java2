package lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.voice());

        //  Cat cat=new Cat();
        // System.out.println(cat.voice());

        // Dog dog=new Dog();
        //  System.out.println(dog.voice);
        Animal[] animals = {new Cat(), new Dog(),new Hen()};
        for (Animal a : animals) {
            System.out.println(a.voice());
        }
    }
}
