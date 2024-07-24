package ch6_date_time.ex09_chrono_unit_field;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030,2,10,13,30,59);

        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));         // month : 2
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));           // day : 10
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));             // hour : 13
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));       // minute : 30
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));   // second : 59

        // 편의 메소드
        System.out.println("============ 펀의 메소드 사용");
        System.out.println("YEAR = " + dt.getYear());                       // year : 2030
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());        // month : 2
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth());         // day : 10
        System.out.println("HOUR_OF_DAY = " + dt.getHour());                // hour : 13
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());           // minute : 30
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond());         // second : 59

        System.out.println("========== 편의 메소드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));     //  day -> minute / 10 -> 810
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));     // 48659
    }
}
