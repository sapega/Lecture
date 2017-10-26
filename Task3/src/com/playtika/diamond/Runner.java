package com.playtika.diamond;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number more than 1 to get an excellent diamond");

        try {
            int input = scanner.nextInt();

            // Draw first triangle
            for (int i = 0; i <= input; i++) {

                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    if ((j == 1) || (j == (2 * i) - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

            // Draw second triangle
            for (int i = input - 1; i >= 1; i--) {
                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    if ((j == 1) || (j == (2 * i) - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Next time enter an integer");
        }
    }
}