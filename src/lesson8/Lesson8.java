package lesson8;

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
        int[] array={7,2,-5,11,1,-2,0};
        //array[0]=12;
        System.out.println(array[2]);//null is not 0
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        // for(int i= 4;i>-1;i--){
      //  System.out.println(i);
        //}
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
        for (int i:array){
            System.out.println(i+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
