package ch3_string_class.ex9_string_builder_2;

import javax.print.DocFlavor;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                .delete(4,8)
                .reverse()
                .toString();

        System.out.println("String = " + str);
    }
}
