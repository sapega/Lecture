package com.playtika.calendar;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    private static final String MONDAY = "Monday";
    private static final String TUESDAY = "Tuesday";
    private static final String WEDNESDAY = "Wednesday";
    private static final String THURSDAY = "Thursday";
    private static final String FRIDAY = "Friday";
    private static final String SATURDAY = "Saturday";
    private static final String SUNDAY = "Sunday";


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type number from 1 to 7 to find a day");

        try {
            int readNumber = scanner.nextInt();
            switch (readNumber) {
                case 1:
                    System.out.println(MONDAY);
                    break;
                case 2:
                    System.out.println(TUESDAY);
                    break;
                case 3:
                    System.out.println(WEDNESDAY);
                    break;
                case 4:
                    System.out.println(THURSDAY);
                    break;
                case 5:
                    System.out.println(FRIDAY);
                    break;
                case 6:
                    System.out.println(SATURDAY);
                    break;
                case 7:
                    System.out.println(SUNDAY);
                    break;
                default:
                    System.out.println("You should type the range from 1 to 7");
                    break;

            }

        } catch (InputMismatchException e) {
            System.out.println("You input is not in the range from 1 to 7. Please ty again");
        }
    }
}
