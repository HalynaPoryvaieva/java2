package lesson23;

import lesson22.TriangleRectangle;

/**
 * AIT-TR, cohort 42.1, Java Basic,lesson23
 * @version 6-mer-24
 * @author Halyna Poryvaieva
 */
public class Lesson23 {
    public static void main(String[] args) {

        Lesson23 lesson23 = new Lesson23();
        System.out.println(lesson23);
        System.out.println(lesson23.hashCode());
        System.out.println(Integer.toHexString(lesson23.hashCode()));
        System.out.println(lesson23.getClass().getSimpleName());
        lesson23.equals(lesson23);
        String s1 = "ddd";
        String s2 = "ddd";
        String s3 = "sss";
        s2=s3+"y";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);

        TriangleRectangle tr1=new TriangleRectangle(4,6);
        TriangleRectangle tr2=new TriangleRectangle(4,6);
        System.out.println("tr1"+tr1.equals(tr2)); //звичайний по умовчуванне зривняння по ссилци
        System.out.println("tr2"+tr1.equals(tr2));//перезагрузка метода equals в класе TriangleRectangle(критерии по параметрах.по значенню сторин)
    }

    @Override
    public String toString() {
        return "Lesson23";
    }
}
