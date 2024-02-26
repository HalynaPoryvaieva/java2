package lesson18;

public class Robot {

    public static final String COMPANY_NAME ="Boston Dynamic";

   private int countCPU;

   private static int count;

   private int suma;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        this.suma=0;
        count++;
    }

   public static int getCount(){
        return count;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public void addAndSave(int a){
        suma+=a;
    }

    public int getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}
