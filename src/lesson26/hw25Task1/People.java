package lesson26.hw25Task1;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw25,Task1
 * @version 13-Mar-24
 * @author Halyna Poryvaieva
 */
public class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("speed = unknown");
    }

    public void rest() {
        switch (this.getClass().getSimpleName()) {
            case "OrdinaryMan":
                System.out.println(this.name + "speed 5 km/h");
            case "AmateurAthlete":
                System.out.println(this.name + "speed 10 km/h");
            case "ProfessionalAthlete":
                System.out.println(this.name + "speed 5 km/h");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + this.name);
        }
    }
}
