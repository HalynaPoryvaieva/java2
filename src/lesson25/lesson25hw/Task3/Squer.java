package lesson25.lesson25hw.Task3;

public class Squer extends Figure{

    private  int side;

    public Squer(int side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(side);
    }
}
