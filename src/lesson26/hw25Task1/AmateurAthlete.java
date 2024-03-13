package lesson26.hw25Task1;

public class AmateurAthlete extends People {

    private String AmateurAthlete;

    public AmateurAthlete(String name, String amateurAthlete) {
        super(name);
        AmateurAthlete = amateurAthlete;
    }

    @Override
    public void run() {
        System.out.println("speed 15 km/h");
        rest();
    }
}
