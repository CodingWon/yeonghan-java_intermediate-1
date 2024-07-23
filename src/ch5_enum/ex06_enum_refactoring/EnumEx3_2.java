package ch5_enum.ex06_enum_refactoring;

public class EnumEx3_2 {
    public static void main(String[] args) {
        int price = 10000;


        int basic = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);
    }
}