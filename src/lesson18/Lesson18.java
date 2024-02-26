package lesson18;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw17,Task1
 * @version 23-Feb-24
 * @author Halyna Poryvaieva
 */
public class Lesson18 {
    public static void main(String[] args) {
        final int a;
        a=10;

        Robot robot=new Robot(8);
        System.out.println(robot);
        System.out.println(Robot.COMPANY_NAME);
        System.out.println(Robot.add(2,2));
        System.out.println(Robot.getCount());
        robot.addAndSave(5);
        robot.addAndSave(12);
        System.out.println(robot.getSuma());

        Robot robot1=new Robot(2);
        System.out.println(robot1);
        System.out.println(Robot.getCount());
        System.out.println(robot1.getSuma());
    }
}
