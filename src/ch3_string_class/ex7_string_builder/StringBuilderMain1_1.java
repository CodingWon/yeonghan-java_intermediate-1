package ch3_string_class.ex7_string_builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("String = " + string);
    }
}

/*
*   String 은 불변
*   StringBuilder 는 가변
*       => 하나의 객체 안에서 문자열을 추가, 삭제, 수정할 수 있다.
*       => StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 String으로 변환하는 것이 좋다.
* */