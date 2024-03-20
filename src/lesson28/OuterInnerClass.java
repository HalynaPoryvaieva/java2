package lesson28;

public class OuterInnerClass {

    private String field="field";

    private void pintText(){
        System.out.println("private Text");
    }

    public void useInnerClas(){
        InnerClass innerClass=new InnerClass();
        innerClass.getField();
        innerClass.innerPrintText();
    }

    class InnerClass{
        String getField(){
            return field;
        }

        private void innerPrintText(){
            pintText();
        }
    }
}
