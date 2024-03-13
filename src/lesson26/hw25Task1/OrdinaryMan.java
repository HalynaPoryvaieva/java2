package lesson26.hw25Task1;

public class OrdinaryMan extends People {

    private String OrdinaryMan;

    public OrdinaryMan(String name, String ordinaryMan) {
        super(name);
        OrdinaryMan = ordinaryMan;
    }

    @Override
    public void run() {
        System.out.println("speed 10 km/h");
        rest();
    }
}
