package lesson28;

public class OuterAndInnerStaticClass {


    private String field="field";

    private void pintText(){
        System.out.println("private Text");
    }

    public void useInnerClas(){
       InnerClass innerClass=new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }

    static class InnerClass{
        String getField(){
            //return field;
            return "statik class field";
        }

         void innerPrintText(){
           // pintText();
            System.out.println("method");
        }
    }
}
