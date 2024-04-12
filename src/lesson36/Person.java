package lesson36;

public class Person {
    private int id;
    private String name;
    private int age;
    private static int idCounter=0;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setIdCounter(int idCounter) {
        Person.idCounter = idCounter;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
