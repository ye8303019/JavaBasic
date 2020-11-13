package com.chris.time_test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by ye830 on 6/21/2018.
 */
public class TimeTest {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDate.atZone(ZoneId.of("UTC"));
        System.out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}
