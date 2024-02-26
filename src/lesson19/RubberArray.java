package lesson19;

import java.util.AbstractList;

public class RubberArray {

    private final int INIT_DATA_SIZE = 3;
    private final float RESIZE_KOEF=1.5f;

    private int[] data;

    private int length;

    public RubberArray() {
            data = new int[INIT_DATA_SIZE];
            length = 0;
    }

    public int get(int idx){
        return data[idx];
    }

    public void add(int value){
        if (length==data.length){
            data[length]=value;
            length++;
        }else {
            int[] newData=new int[(int) (data.length*RESIZE_KOEF)];
            for (int i=0;i<data.length;i++){
                newData[i]=data[i];
            }
            data=newData;
        }
        data[length]=value;
        length++;
    }
    public void add(int value,int idx){
        //0,1,2,3,4,5
        //4,6,5,2,6,1
        //TODO implement
    }

    public void remove(int idx){
        for (int i=idx;i<data.length-1;i++){
            data [i]=data[i+1];
        }
        length--;
    }

    @Override
    public String toString() {
        //TODO use StringBuilder instead of String
        String str="[";
        for (int i=0;i<length;i++){
            str+=String.valueOf(data[i]);
            if (i<length-1){
                str+=",";
            }
        }
        return str +"]";
    }
}
