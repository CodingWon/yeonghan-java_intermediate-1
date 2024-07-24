package ch6_date_time.ex07_instant_time;

import java.time.Instant;
import java.time.ZonedDateTime;

/*
*   Instant` 는 날짜와 시간을 나노초 정밀도로 표현하며, 1970년 1월 1일 0시 0분 0초(UTC 기준)를 기준으로 경과한 시간으로 계산된다.
*   UTC 기준 1970년 1월 1일 0시 0분 10초라면 `seconds` 에 10이 들어간다.
*
*   장점
*   - 시간대 독립성: `Instant` 는 UTC를 기준으로 하므로, 시간대에 영향을 받지 않는다. 이는 전 세계 어디서나 동일한 시점을 가리키는데 유용하다
*   - 고정된 기준점: 모든 `Instant` 는 1970년 1월 1일 UTC를 기준으로 하기 때문에, 시간 계산 및 비교가 명확하고 일관된다.
* */

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();            // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
