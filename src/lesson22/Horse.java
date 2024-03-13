package lesson22;

public class Horse {
   private String name;

    public Horse(String name) {
        this.name = name;
    }

    public void run(){
       System.out.println("Run.....");
   }

   public void walk(){
       System.out.println("Walk....");
   }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
