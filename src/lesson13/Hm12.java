package lesson13;

import lesson9.HomeWork9;

import java.util.Arrays;

public class Hm12 {
    public static void main(String[] args) {
        //task 1
        int[] array=HomeWork9.createRandomArray(25,25);
        System.out.println(Arrays.toString(array));
        System.out.println(linerSerhc(array,6));
        System.out.println(linerSerhc(new int[]{1,2,3},4));
        //Task2
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        //Task 3
        System.out.println(binarySearch(array,8));
        //Task 4
        Stack.push(12);
        Stack.push(8);
        Stack.push(-3);
        System.out.println(Stack.arrayToString());
        System.out.println(Stack.pop());
        System.out.println(Stack.arrayToString());



    }
   public static int linerSerhc (int[]a,int n){

        for (int i = 0; i < a.length; i++) {
            if (a[i]==n){
                return i;
            }

        }
        return -1;


    }
     public static void selectionSort(int[]a){
        for (int i = 0; i < a.length-1; i++) {
            int min=a[i+1];
            int minIdx=i+1;
            for (int j = i+1; j < a.length ; j++) {
                if (a[j]<min){
                    min=a[j];
                    minIdx=j;

                }

            }
            if (a [i]>min){
                a[minIdx]=a[i];
                a[i]=min;
            }
        }

    }
   public static int binarySearch(int[]a,int n){
        int left=0;
        int right=a.length-1;
        while (left+1!=right){


        int middle=left+(right-left)/2;
        if (a [middle]==n){
            return middle;
        }
        if (a [middle]>n){
            right=middle;
        }else {
            left=middle;
        }
    }
        return -1;
}
}