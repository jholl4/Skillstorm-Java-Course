package com.skillstorm;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration {

    public static void main(String[] args) {
        Period oneYear = Period.ofYears(1);
        System.out.println(oneYear);

        Period longTime = Period.of(2, 10, 5);
        System.out.println(longTime);

        Duration duration = Duration.ofDays(2);
        System.out.println(duration);

        Duration oneHr30Min = Duration.ofMinutes(90);
        System.out.println(oneHr30Min);

        ZonedDateTime beforeDaylightSavings = ZonedDateTime.of(2024, 3, 9, 13, 00, 00, 00, ZoneId.systemDefault());
        System.out.println(beforeDaylightSavings);

        LocalTime now = LocalTime.now();
        LocalTime eod = LocalTime.of(18, 0);

        Duration between = Duration.ofMinutes(now.until(eod, ChronoUnit.MINUTES));

        System.out.println(between);
    }

}
