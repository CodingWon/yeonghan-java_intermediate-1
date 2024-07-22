package ch4_wrapper_class_of_class.ex04_class_create;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass1 = Hello.class;
        Class helloClass2 = Class.forName("ch4_wrapper_class_of_class.ex04_class_create.Hello");
        Class helloClass3 = new Hello().getClass();

        System.out.println("helloClass1 : " + helloClass1);
        System.out.println("helloClass2 : " + helloClass2);
        System.out.println("helloClass3 : " + helloClass3);

        Hello hello = (Hello) helloClass1.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result : " + result);
    }
}
