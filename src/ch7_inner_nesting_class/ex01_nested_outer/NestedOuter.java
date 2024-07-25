package ch7_inner_nesting_class.ex01_nested_outer;

public class NestedOuter {
    private static int outClassValue =3;
    private int outInstatncValue =2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print(){
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //System.out.println(outInstatncValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private 도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }

}
