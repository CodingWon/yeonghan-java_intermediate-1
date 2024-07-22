package ch3_string_class.pro5_count;

public class TestString5 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0){
            System.out.println("index : " + index);
            index = str.indexOf(key, index +1);
            count++;
        }
        System.out.println("count = " + count);

    }
}
