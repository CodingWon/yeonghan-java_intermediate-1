package ch6_date_time.pro03_디데이_구하기;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024,1,1);
        LocalDate endDate = LocalDate.of(2024,11,21);

        Period period = Period.between(startDate,endDate);

        long betweenyear = ChronoUnit.YEARS.between(startDate,endDate);
        long betweenMonth = ChronoUnit.MONTHS.between(startDate,endDate);
        long betweenDate = ChronoUnit.DAYS.between(startDate,endDate);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : " + betweenyear + "년 " +betweenMonth +"개월 " +betweenDate + "일");
        System.out.println("디데이 : " + betweenDate + "일 남음");

    }
}
