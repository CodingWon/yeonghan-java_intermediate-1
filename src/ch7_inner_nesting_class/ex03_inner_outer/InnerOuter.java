package ch7_inner_nesting_class.ex03_inner_outer;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        // `private` 접근 제어자에 접근할 수 있다
        private int innerInstanceValue =1;

        public void print(){
            // 자신의 멤버에 접근
            System.out.println(innerInstanceValue);
            
            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);
            
            // 외부 클래스의 클래스 멤버에는 접근 가능. private 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }
    }
}
