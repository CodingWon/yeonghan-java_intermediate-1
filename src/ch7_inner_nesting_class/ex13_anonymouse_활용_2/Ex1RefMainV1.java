package ch7_inner_nesting_class.ex13_anonymouse_활용_2;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello (Process process){
        System.out.println("프로그램 시작 ");
        process.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process{
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 =" + randomValue);
        }
    }

    static class Sum implements Process{
        @Override
        public void run() {
            //코드 조각 시작
            for (int i = 0; i<=3; i++){
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
