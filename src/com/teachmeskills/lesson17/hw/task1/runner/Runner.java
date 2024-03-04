package com.teachmeskills.lesson17.hw.task1.runner;

import com.teachmeskills.lesson17.hw.task1.service.UserRequestService;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        String operationNumber = UserRequestService.getOperationNumber(new Scanner(System.in));
        switch (operationNumber) {
            case "1":
                UserRequestService.handleOperation1();
                break;
            case "2":
                UserRequestService.handleOperation2();
                break;
            default:
                System.out.println("Unexpected operation number: " + operationNumber);
        }
    }

}
