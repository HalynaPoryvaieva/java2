package lesson17;

/**
 * AIT-TR, cohort 42.1, Java Basic,Lesson17
 * @version 21-Feb-24
 * @author Halyna Poryvaieva
 */
public class Lesson17 {
    public static void main(String[] args) {
        Cat cat=new Cat("Tom","white",3);
        System.out.println("name:"+cat.getName()+",color:"+cat.color+",age:"+cat.age);
        cat.voice();
    }
}
