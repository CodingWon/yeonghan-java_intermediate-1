package ch5_enum.ex03_type_safety_enum_type;

/*
*  ENUM 의 장점
* - 타입 안정성 향상 : 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능성이 없다.
* - 간결성 및 일관성 : 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장
* - 확장성 : 새로운 회원 등급을 타입에 추가하고 싶을 때, ENUM 에 새로운 상수를 추가하기만 하면 된다.
* */

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("=== 클래스 === ");
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " +  Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("=== 참조값 === ");
        System.out.println("ref BASIC = " + Grade.BASIC);
        System.out.println("ref BASIC = " + Grade.GOLD);
        System.out.println("ref BASIC = " + Grade.DIAMOND);
    }
}
