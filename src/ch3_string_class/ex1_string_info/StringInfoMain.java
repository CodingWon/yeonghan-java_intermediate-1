package ch3_string_class.ex1_string_info;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이 : " + str.length());                   // 12
        System.out.println("문자열의 비어 있는지1 : " + str.isEmpty());           // 길이가 0 : false
        System.out.println("문자열의 비어 있는지2 : " + "    ".isEmpty());        // 길이가 0 : false
        System.out.println("문자열의 비어 있는지3 : " + "".isEmpty());            // 길이가 0 : true
        System.out.println("문자열이 비어 있거나 공백인지 1 : " + str.isBlank());   // 길이가 0 or 공백 : false
        System.out.println("문자열이 비어 있거나 공백인지 2 : " + "    ".isBlank()); //                : true

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 : " + c);    // J
    }
}
