package lesson26.hw25Task1;

public class ProfessionalAthlete extends People {

    private String ProfessionalAthlete;

    public ProfessionalAthlete(String name, String professionalAthlete) {
        super(name);
        ProfessionalAthlete = professionalAthlete;
    }

    @Override
    public void run() {
        System.out.println("speed 25 km/h");
        rest();
    }
}
