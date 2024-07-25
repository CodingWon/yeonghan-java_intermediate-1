package ch7_inner_nesting_class.ex03_inner_outer;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        //  바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
        //class ch7_inner_nesting_class.ex03_inner_outer.InnerOuter$Inner
    }
}
