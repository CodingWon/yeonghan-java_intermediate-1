package ch7_inner_nesting_class.ex06_local_class;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;
        
        // 지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);                     // 0
                System.out.println("localVar = " + localVar);               // 1
                System.out.println("paramVar = " + paramVar);               // 2
                System.out.println("outInstanceVar = " + outInstanceVar);   // 3
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
