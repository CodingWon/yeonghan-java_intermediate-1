package ch3_string_class.pro4_substring;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,str.indexOf(".txt"));
        String extName = str.substring(str.indexOf(".txt"));

        System.out.println("filename : " + filename);
        System.out.println("extName : " + extName);
    }
}
