package lesson36;

/**
 * AIT-TR,Java Basic,Task1
 * @author Halyna Poryvaieva
 * @version 12-04-24
 */
public class HomeWork36 {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Taras", 1234567);
        telephoneDirectory.add("Ivan", 654389);
        telephoneDirectory.add("Davyd", 9876543);
        telephoneDirectory.add("Ivan", 54999076);
        System.out.println(telephoneDirectory.get("Taras"));
        System.out.println(telephoneDirectory.get("Davyd"));
        System.out.println(telephoneDirectory.get("Ivan"));
    }
}
