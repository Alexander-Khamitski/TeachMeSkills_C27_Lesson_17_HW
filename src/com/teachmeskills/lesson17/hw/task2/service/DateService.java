package com.teachmeskills.lesson17.hw.task2.service;

import com.teachmeskills.lesson17.hw.task2.consts.Constants;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateService {

    public static void getDayOfWeekByDate(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(Constants.DATE_PATTERN));
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
    }

}
