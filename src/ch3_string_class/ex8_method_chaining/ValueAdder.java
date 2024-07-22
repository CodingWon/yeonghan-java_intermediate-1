package ch3_string_class.ex8_method_chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue){
        this.value += addValue;
        return this;
    }

    public int getValue(){
        return this.value;
    }
}
