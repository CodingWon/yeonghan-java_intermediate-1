package ch6_date_time.ex06_offset_date_time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
*   OffsetDateTime
*   - OffsetDateTime 은 LocalDateTime 에 UTC 오프셋 정보인 ZoneOffset 이 합쳐진 것이다.
*   - 시간대를 고려한 날짜와 시간을 표현할 때 사용 한다. 여기에는 타임존은 없고, UTC로 부터의 시간 대 차이인 고정된 오프셋만 포함한다.
*
*   - 서머 타임(영국 영어: summer time)은 하절기에 표준시를 원래 시간보다 한 시간 앞당긴 시간을 쓰는 것을 말한다. 즉, 0시에 일광 절약 시간제를 실시하면 1시로 시간을 조정해야 하는 것이다.
*   - ZonedDateTime` 이나 `OffsetDateTime` 은 글로벌 서비스를 하지 않으면 잘 사용하지 않는다
* */
public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
