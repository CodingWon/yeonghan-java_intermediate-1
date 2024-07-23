package ch5_enum.ex05_enum_refactoring;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("=== 클래스 === ");
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " +  ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("=== 참조값 === ");
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref BASIC = " + ClassGrade.GOLD);
        System.out.println("ref BASIC = " + ClassGrade.DIAMOND);
    }
}
