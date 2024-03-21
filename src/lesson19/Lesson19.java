package lesson19;

public class Lesson19 {
    public static void main(String[] args) {
        RubberArray ra=new RubberArray();
        ra.add(8);
        ra.add(12);
        ra.add(-1);
        ra.add(3);
        ra.add(25);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);

        //Hw19,Task 2,3,4,1
        System.out.println(ra.contains(12));
        System.out.println(ra.indexOf(8));
        ra.add(1,0);
        System.out.println(ra.toString());
    }
}
