package ch7_inner_nesting_class.pro3_지역_클래스를_완성해라;

public class OuterClass3 {
    public void myMethod(){

        class LocalClass {
            public void hello(){
                System.out.println("hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
