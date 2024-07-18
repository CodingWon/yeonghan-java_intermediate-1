package ch3_string_class.ex6_string_util;

public class StringUtilsMain {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = true;
        String str = "Heelo, Java!";

        //valueOf 메소드
        String numString = String.valueOf(num);
        System.out.println("" +
                "숫자의 문자열 값 : " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 : " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값 : " + objString);

        //toCharArray 메소드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열 무자 배열로 변환 : " + strCharArray);
        for(char c : strCharArray){
            System.out.println(c);
        }


    }
}
