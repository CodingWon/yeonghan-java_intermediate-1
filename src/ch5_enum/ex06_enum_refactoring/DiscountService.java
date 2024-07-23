package ch5_enum.ex06_enum_refactoring;

public class DiscountService {

    public int discount(Grade grade, int price){
        return grade.discount(price);
    }
}
