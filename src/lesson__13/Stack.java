package lesson__13;

import java.util.Arrays;

public class Stack {
    static int[]stack=new int[10];
    static  int idx=0;
    public static void push(int value){
        if (idx<stack.length){
            stack[idx]=value;
            idx++;
        }else {
         throw   new RuntimeException("Stack overflow");
        }

    }
    public static Integer pop(){
        if (idx>1){
            idx--;
            return stack[idx];

        }
       return null;
    }
   public static String arrayToString(){
      return Arrays.toString(Arrays.copyOf(stack,idx));

    }

}
