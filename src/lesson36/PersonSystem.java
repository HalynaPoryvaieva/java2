package lesson36;

import java.util.*;

public class PersonSystem {

    static Scanner scanner = new Scanner(System.in);

    static Map<Integer, Person> idMap = new HashMap<>();

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("Simple personal system:");
        char operation;
        do {
            System.out.println("Enter operation (a[dd],d[elete],u[pdate],p[rint],x-exit):");
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'a':
                    add(persons);
                    break;
                case 'd':
                    delete(persons);
                    break;
                case 'u':
                   // update(persons);
                    break;
                case 'p':
                   // print(persons);
                    break;

                case 'f':
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefinded operation:" + operation);
            }
        } while (operation != 'x');
    }

    static void add(List<Person> persons) {
        System.out.println("Add:name & age: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        idMap.put(person.getId(), person);
        persons.add(person);

    }

    static void delete(List<Person> persons) {
        System.out.println("Delete:id:");
        int id = scanner.nextInt();
        //Person findPerson=findById(persons,id);
        Person findPerson = idMap.get(id);
        if (findPerson != null) {
            persons.remove(findPerson);
            idMap.remove(id);
        }
    }
}

//static void update(List<Person> persons) {
//    System.out.println("Update: id & name & age: ");
//    int id = scanner.nextInt();
//    String name = scanner.next();
//    int age = scanner.nextInt();
//    Person findPerson = idMap.get(id);
//    if (findPerson != null) {
//        findPerson.setName(name);
//        findPerson.setAge(age);
//    }
//}
//
//static void find
//
//static Person findById(List<Person> persons, int id) {
//    for (Person person : persons) {
//        if (person.getId() == id) {
//            person.getId();
//            person.setName(name);
//            person.setAge(age);
//            break;
//        }
//    }
//    return null;
//}
//
//static void print(List<Person> persons) {
//    persons.forEach(System.out::println);
//}
