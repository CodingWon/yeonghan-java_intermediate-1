package ch7_inner_nesting_class.ex01_nested_outer;

/*
*  - 여기서`new NestedOuter()` 로 만든 바깥 클래스의 인스턴스와 `
*     new NestedOuter.Nested()` 로 만든 정적 중첩 클래스의 인스턴스는 서로 아무 관계가 없는 인스턴스이다
* */
public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
