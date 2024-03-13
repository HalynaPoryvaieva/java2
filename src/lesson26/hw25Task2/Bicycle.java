package lesson26.hw25Task2;

public class Bicycle extends Vehicle {

    private Integer motorType;

    public Bicycle(Integer motorType) {
        super(motorType);
    }

    @Override
    public void startEngine() {
        System.out.println("Bicycle doesn't have an engine"+motorType);
    }
}
