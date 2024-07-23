package ch5_enum.pro1_enum_grade;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for(AuthGrade value : values){
            System.out.println("greade = " + value.name() + " , level= " + value.getLevel() + ", 설명 = " + value.getDescription());
        }
    }
}
