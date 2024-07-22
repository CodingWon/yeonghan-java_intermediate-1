package ch4_wrapper_class_of_class.ex02_wrapper_necessity;

import ch4_wrapper_class_of_class.ex02_wrapper_necessity.MyInteger;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));
    }


    private static MyInteger findValue(MyInteger[] intArr, int target){
        for(MyInteger myInteger : intArr){
            if(myInteger.getValue() == target){
                return myInteger;
            }
        }
        return null;
    }
}
