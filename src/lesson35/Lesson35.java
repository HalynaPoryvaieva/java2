package lesson35;

import lesson34.Person;

import java.util.*;

public class Lesson35 {
    public static void main(String[] args) {
        List<String> strlist =new ArrayList<>(List.of("Hello","I","love","Java"));
        strlist.add("too");
        strlist.add("Hello");
        System.out.println(strlist);

        Set<String> strSet =new HashSet<>(List.of("Hello","I","love","Java"));
        System.out.println(strSet.add("too"));
        System.out.println(strlist.add("Hello"));
        System.out.println(strSet);

        Set<String> strLinkedSet =new LinkedHashSet<>(List.of("Hello","I","love","Java"));
        System.out.println(strLinkedSet.add("too"));
        System.out.println(strLinkedSet.add("Hello"));
        System.out.println(strLinkedSet);

        Person p1=new Person("Mike",35);
        Person p2=new Person("Mike",35);
        System.out.println(p1.equals(p2));

        Map<Integer,Person> strMap =new HashMap<>();
        strMap.put(125,new Person("Luke",28));

        System.out.println(strMap.get(125));
    }
}
