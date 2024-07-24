package ch6_date_time.pro04_시작요일_마지막_요일_구하기;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        // 입력 받은 월의 첫날 요일과 마지막날 요일을 구하라
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year,month,1);
        System.out.println(date);

        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " +lastDayOfWeek);

    }
}
