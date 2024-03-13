package lesson23.Hw22;

public class Animal {

    protected String color;

    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public String voice(){
        return "unknow";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
