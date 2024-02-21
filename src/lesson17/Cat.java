package lesson17;

/**
 * AIT-TR, cohort 42.1, Java Basic,Lesson17
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class Cat {
    private String name;
    public String color;
    public int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void setName(String name){
        if (name!=null){
            this.name=name;
        }
    }
    public String getName(){
        return name;
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
