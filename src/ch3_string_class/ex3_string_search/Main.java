package ch3_string_class.ex3_string_search;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";
        System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str.contains("Java"));  // true
        System.out.println("'Java'의 첫 번째 인덱스 : " + str.indexOf("Java"));            // 7
        System.out.println("인덱스 10 부터 'Java'의 인덱스 : " + str.indexOf("Java",10));   // 24
        System.out.println("'Java'의 마지막 인덱스 : " + str.lastIndexOf("Java"));          // 24

    }
}
