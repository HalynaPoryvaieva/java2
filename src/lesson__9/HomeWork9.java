package lesson__9;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9 {
    public static void main(String[] args) {
        int[]array=createRandomArray(6,100);
        //task 1
        task1(5);
        //task 2
       // printArray(array);
        //task 3
       // printArray(array,false);
      //  printArray(array,true);
        //task 4
        //System.out.println(Arrays.toString(calculateArray(array)));
    }
    static void task1(int n){
        for (int i = 0; i <=n; i++) {
            System.out.println("Task 1"+i);


        }
    }
   public static int[]createRandomArray(int len,int bount){
        int[]a=new int[len];
        Random random=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(bount);

        }
        return a;


    }
   // static void printArray(int[]a) {printArray(a,true);}
    //static void printArray(int  []a,boolean reverseDirection){
      //  if (reverseDirection){
        //    for (int i = a.length- 1;i >-1 ; i--) {

          //  }
        //}
    //}
}
