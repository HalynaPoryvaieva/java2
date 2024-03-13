package lesson26.hw25Task2;

public class VehicleArray {
    public static void main(String[] args) {

        Vehicle[] vehicles;
        vehicles = new Vehicle[]{new Car(1),
                new Bicycle(2),
                new Motorcycle(3)};

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
