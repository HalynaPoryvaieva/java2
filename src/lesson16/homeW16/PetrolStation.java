package lesson16.homeW16;

public class PetrolStation {
    double fuel;

    public PetrolStation(double fuel) {
        this.fuel = fuel;
    }
    public void decreaseFuel(double fuel){
        if (this.fuel-fuel<0){
            return 0;
        }
        this.fuel-=fuel;
        return fuel;
    }
}
