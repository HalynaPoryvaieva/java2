package lesson18.lesson19;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw19,Task1,2,3,4
 * @version 28-Feb-24
 * @author Halyna Poryvaieva
 */
public class RubberArray {

    private final int INIT_DATA_SIZE = 3;
    private final float RESIZE_KOEF = 1.5f;

    private int[] data;

    private int length;

    public RubberArray() {
        data = new int[INIT_DATA_SIZE];
        length = 0;
    }

    public int get(int idx) {
        return data[idx];
    }
    private void extendArrayIfNeed(){
        if(length==data.length){
            int[] newData=new int[(int) (data.length*RESIZE_KOEF)];
            for (int i=0;i<data.length;i++){
                newData[i]=data[i];
            }
            data=newData;
        }
    }

    public void add(int value) {
       extendArrayIfNeed();
            data[length] = value;
            length++;
    }

    //Task 4
    public void add(int value, int idx) {
        extendArrayIfNeed();
        for (int i = length; i > idx; i--) {
            data[i] = data[i - 1];
        }
        data[idx] = value;
        length++;
    }

    public void remove(int idx) {
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    //Task2
    public boolean contains(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    //Task3
    public int indexOf(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //Task1
    @Override
    public String toString() {
        StringBuilder strSb = new StringBuilder();
        strSb.append("[");
        for (int i = 0; i < length; i++) {
            strSb.append(data[i]);
            if (i < length - 1) {
                strSb.append(",");
            }
        }
        strSb.append("]");
        return strSb.toString();
    }
}
