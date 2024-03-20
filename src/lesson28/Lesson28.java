package lesson28;

public class Lesson28 {
    public static void main(String[] args) {
        OuterInnerClass outerInnerClass=new OuterInnerClass();
        outerInnerClass.useInnerClas();

        OuterAndInnerStaticClass outerAndInnerStaticClass=new OuterAndInnerStaticClass();
        outerAndInnerStaticClass.useInnerClas();

        OuterAndInnerStaticClass.InnerClass innerClass=new OuterAndInnerStaticClass.InnerClass();
    }
}
