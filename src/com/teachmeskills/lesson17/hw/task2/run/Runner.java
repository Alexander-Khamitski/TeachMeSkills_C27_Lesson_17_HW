package com.teachmeskills.lesson17.hw.task2.run;

import com.teachmeskills.lesson17.hw.task2.consts.Constants;
import com.teachmeskills.lesson17.hw.task2.service.DateService;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in next format: " + Constants.DATE_PATTERN);
        String date = scanner.nextLine();
        DateService.getDayOfWeekByDate(date);
        scanner.close();
    }

}
