package ch5_enum.ex06_enum_refactoring;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);
    private final int discountPercent;

    Grade (int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent(){
        return discountPercent;
    }
}
