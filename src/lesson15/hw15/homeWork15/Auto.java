package lesson15.hw15.homeWork15;

public class Auto {
    int fule;
    double maxFuel = 30;
    boolean engineOn;

    public Auto(int fule, double maxFuel) {
        this.fule = fule;
        this.maxFuel = maxFuel;
        this.engineOn=false;
    }

    public void refile(double fule) {
        if (this.fule + fule > maxFuel) {
            this.fule = (int)maxFuel;
            return;
        }
        this.fule += fule;
    }

    public double drive(int distance) {
        if (!engineOn){
            return 0;
        }
        fule -= 0.5 * distance;
        return distance;
    }

    public boolean startEngine(){
        engineOn=fule>0;
        return engineOn;
    }
}

