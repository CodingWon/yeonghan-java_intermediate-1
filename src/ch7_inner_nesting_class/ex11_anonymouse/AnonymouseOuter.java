package ch7_inner_nesting_class.ex11_anonymouse;

/*
*   - 익명 클래스는 이름이 없는 지역 클래스 이다.
*   - 특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
*   - 지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.
* */
public class AnonymouseOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 익명 클래스
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        // 익멱 클래스 사용
        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymouseOuter anonymouseOuter = new AnonymouseOuter();
        anonymouseOuter.process(2);
    }
}
