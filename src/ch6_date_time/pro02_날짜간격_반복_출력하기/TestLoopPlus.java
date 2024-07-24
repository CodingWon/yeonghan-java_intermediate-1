package ch6_date_time.pro02_날짜간격_반복_출력하기;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024,01,01);

        for (int i =0; i<5; i++){
            LocalDate resultDate = ld.plusWeeks(2*i);
            System.out.println("날짜 " +(i+1) + ": " + resultDate);
        }
    }
}
