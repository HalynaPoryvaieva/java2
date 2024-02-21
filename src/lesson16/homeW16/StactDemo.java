package lesson16.homeW16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson 17
 * @version 18-Feb-24
 * @author Halyna Poryvaieva
 */
public class StactDemo {
    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println(stack.toPrint());
        stack.push(12);
        stack.push(24);
        stack.push(6);
        System.out.println(stack.toPrint());
        System.out.println(stack.pop());
        System.out.println(stack.toPrint());
        System.out.println(stack.pop());
        System.out.println(stack.toPrint());
    }
}
