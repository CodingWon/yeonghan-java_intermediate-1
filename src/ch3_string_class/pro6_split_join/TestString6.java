package ch3_string_class.pro6_split_join;

public class TestString6 {
    public static void main(String[] args) {
        String fruits = "apple, banana, mango";


        // 코드 작성
        String[] splitStrArray = fruits.split(",");

        for (String s : splitStrArray){
            System.out.println(s);
        }

        // 합치기
        String joinedString = String.join("->" , splitStrArray);
        System.out.println("joinedString = " + joinedString);
    }
}
