package ch7_inner_nesting_class.pro2_내부_클래스를_완성해라;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }


}
