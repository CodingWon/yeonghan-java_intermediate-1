package ch6_date_time.ex05_zone_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*  ZoneDateTime
*   - LocalDateTime 에 시간대 정보인 ZoneId가 합쳐진것
*      예) 2024-07-24T10:44:41.707331100+09:00[Asia/Seoul]
*
* */


public class ZoneDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();                                                                 // 2024-07-24T10:49:35.963619+09:00[Asia/Seoul]
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));                                  // 2030-01-01T13:30:50+09:00[Asia/Seoul]
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030,1,1,13,30,50,0,ZoneId.of("Asia/Seoul")); // 2030-01-01T13:30:50+09:00[Asia/Seoul]
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));   // 타임존 변경
        System.out.println("utcZdt = " + utcZdt);                                   // 2030-01-01T04:30:50Z[UTC]
    }
}
