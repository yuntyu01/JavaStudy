package step2.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Future;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 9, 16, 8, 10, 1);

        System.out.println("ofDt = " + ofDt);
        System.out.println("nowDt = " + nowDt);

        LocalDateTime localDateTime = LocalDateTime.of(nowDate, nowTime);

        System.out.println("localDateTime = " + localDateTime);




    }
}
