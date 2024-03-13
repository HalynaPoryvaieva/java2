package lesson26.hw25Task2;

public class Motorcycle extends Vehicle {

    private Integer motorType;

    public Motorcycle( Integer motorType) {
        super(motorType);
        this.motorType = motorType;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
}
