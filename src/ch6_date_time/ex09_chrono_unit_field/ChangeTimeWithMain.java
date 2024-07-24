package ch6_date_time.ex09_chrono_unit_field;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/*
*  6.날짜와 시간.pdf
*   TemporalAdjusters 클래스가 제공하는 주요 기능 참고
* */

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("dt = " + dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);                       // 2020-01-01T13:30:59

        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);                       // 2020-01-01T13:30:59

        //TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 : " + dt);                                    // 기준 날짜 : 2018-01-01T13:30:59
        System.out.println("다음 금요일 : " + with1);                               // 다음 금요일 : 2018-01-05T13:30:59


        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("기준 날짜 : " + dt);                                            // 기준 날짜 : 2018-01-01T13:30:59
        System.out.println("같은 달의 마지막 일요일 = " + with2);                             // 같은 달의 마지막 일요일 = 2018-01-28T13:30:59

    }
}
