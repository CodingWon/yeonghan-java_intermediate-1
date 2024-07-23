package ch5_enum.ex05_enum_refactoring;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent()/100;
    }
}
