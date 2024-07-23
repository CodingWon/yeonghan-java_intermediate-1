package ch5_enum.ex05_enum_refactoring;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //타입 열거형 완성 패턴
    private ClassGrade(){}
}
