package lesson36.hw36;

import java.util.*;

/**
 * AIT-TR,Java Basic,Task1
 * @author Halyna Poryvaieva
 * @version 12-04-24
 */
public class TelephoneDirectory {

    private Map<String, List<Integer>> telephoneDirectory = new TreeMap<>();

    public void add(String name, int phone) {
        List<Integer> phones = telephoneDirectory.get(name);
        if (phones == null) {
            phones = new ArrayList<>(List.of(phone));
            telephoneDirectory.put(name, phones);
        } else {
            phones.add(phone);
        }
    }

    public List<Integer> get(String name) {
        return telephoneDirectory.get(name);
    }

    @Override
    public String toString() {
        return telephoneDirectory.toString();
    }
}
