package lesson26.hw25Task2;

public class Car extends Vehicle {
    private Integer motorType;

    public Car(Integer motorType) {
        super(motorType);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started" + motorType);
    }
}
