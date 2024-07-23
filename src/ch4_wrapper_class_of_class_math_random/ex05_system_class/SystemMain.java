package ch4_wrapper_class_of_class_math_random.ex05_system_class;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        System.out.println();
        System.out.println("밀리초  =============");
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis :" + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        System.out.println();
        System.out.println("나노초 =============");
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano : " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println();
        System.out.println("환경변수 =============");
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println();
        System.out.println("시스템 속성 =============");
        System.out.println("properties = " + System.getProperties());
        
        // 배열을 고속 복사
        System.out.println();
        System.out.println("배열 고속 복사 =============");
        char [] originalArray = new char[]{'h','e','l','l','o'};
        char [] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + Arrays.toString(copiedArray));
        System.out.println("Array.toString = " + Arrays.toString(originalArray));

    }
}
