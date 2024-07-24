package ch6_date_time.ex10_formatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024,12,31,13,30,59);

        System.out.println("now date : " + now);                                             // now date : 2024-12-31T13:30:59

        //LocalDateTime with format -> String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 : " + formattedDateTime);                        // 날짜와 시간 포맷팅 : 2024-12-31 13:30:59

        // 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2024-12-31 13:30:59";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString,formatter);
        System.out.println("문자열 파싱 날짜와 시간 : " + parsedDateTime);                        // 문자열 파싱 날짜와 시간 : 2024-12-31T13:30:59
    }
}
