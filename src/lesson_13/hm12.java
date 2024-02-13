package lesson_13;

import java.util.Stack;

public class
hm12 {
    public static void main(String[] args) {
        //int p=linerSearch(new int[]{1,8,12,-4,6,3,7,-3});
        //System.out.println(p);



    }
    static int linerSearch(int[] a,int n){
        int p= -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==n){

            return i;
            }
        }
        return -1;


    }
    static int binarySearch(int[] a, int n){
        int left=0;
       int right=a.length-1;
       while (left+1!=right){

       }


       int middleIndex=left+(right-left)/2;
       if (a[middleIndex]==n){
           return middleIndex;
       }
       if (a[middleIndex]>n){
           right=middleIndex;
       }else {
           left=middleIndex;

       }
       return -1;
    }

        }
