package com.allweing.day17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);
        System.out.println(localTime.toString());

        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
    }
}
