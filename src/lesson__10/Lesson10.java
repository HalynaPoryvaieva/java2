package lesson__10;

public class Lesson10 {
    public static void main(String[] args) {
        //java compiler and JVM
        //variables simple types==8
        int a = 25;
        int b = 12 * 3 + a;
        //logics
        boolean f = true;//false;
        boolean l = f && true;//&&(and)||(or)!(not)
        //if-else
        if (a == 3) {
            System.out.println("a=3");

        } else {
            System.out.println("a!=3");
        }
        String s = a == 3 ? "a=3" : "a!=3";//ternary operator
        //switch
        switch (a) {
            case 1:
                System.out.println("a==3 or2 or 3");
                break;
            case 2:
                System.out.println("a!=3");
            //case N:
            default:
                System.out.println("Alternative reality");

        }
        //loops while;do-while
        while (a < 10) {

            //TODO write loop body
            a++;

        }
        //loops for with 2 conunters
        for (int i = 0, j = 4; i < 5; i++, j--) {
            System.out.println("i=" + i + ",j=" + j);

        }
        //array and for
        int[] arr = {4, 8, 1, 12, -3};
        arr[0] = -1;
        for (int item : arr) {
            System.out.println(item + " ");
        }
        System.out.println();
        //using break && continue
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                //break;
                continue;

            }
            System.out.println(arr[i] + " ");

        }
        System.out.println();
        // method(s)
        int sum = add(5, 8);
        System.out.println(sum);


    }

    static int add(int a, int b) {
        return a + b;
    }


}