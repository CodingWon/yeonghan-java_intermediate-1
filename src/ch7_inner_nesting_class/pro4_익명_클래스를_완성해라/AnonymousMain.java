package ch7_inner_nesting_class.pro4_익명_클래스를_완성해라;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
    }
}
