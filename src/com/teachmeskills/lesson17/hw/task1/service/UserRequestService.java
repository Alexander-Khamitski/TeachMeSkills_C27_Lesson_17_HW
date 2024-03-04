package com.teachmeskills.lesson17.hw.task1.service;

import com.teachmeskills.lesson17.hw.task1.customInterface.CustomInterface;

import java.util.Scanner;

public class UserRequestService {

    public static String getOperationNumber(Scanner scanner) {
        System.out.println("Available operations: 1 - get reversed string; 2 - get number factorial;");
        System.out.println("Enter operation number: ");
        String operationNumber = scanner.nextLine();
        scanner.close();
        return operationNumber;
    }

    public static void handleOperation1() {
        CustomInterface<String> customInterfaceString;
        customInterfaceString = (str) -> {
            System.out.println("Original string: " + str);
            return "Reversed string: " + new StringBuilder(str).reverse();
        };
        System.out.println(customInterfaceString.customMethod("String to reverse"));
    }

    public static void handleOperation2() {
        CustomInterface<Integer> customInterfaceInt;
        customInterfaceInt = (intValue) -> {
            System.out.println("Value: " + intValue);
            if (intValue < 0) {
                System.out.printf("Factorial '%d' is undefined!\n", intValue);
                return null;
            }
            int fact = 1;
            for (int i = 2; i <= intValue; i++) {
                fact *= i;
            }
            return fact;
        };
        System.out.println("Factorial: " + customInterfaceInt.customMethod(5));
    }
}
