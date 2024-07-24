package ch6_date_time.pro01_날짜_더하기;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024,1,1,0,0,0);
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시간 : " + dateTime);
        System.out.println("1년 2개울 3일 4시간 후의 시각 : " + futureDateTime);
    }
}
