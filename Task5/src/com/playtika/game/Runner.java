package com.playtika.game;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Let's play a game");
        System.out.println("Enter a word or a sentence to guess final word");
        System.out.println("Please note that for instance: letter V is not the same as v");

        Scanner scanner = new Scanner(System.in);

        String secretWord = "Viachaslau Sapega";

        int numChars = secretWord.length();

        System.out.print("Your secret word is: ");
        for (int i = 0; i < numChars; i++)
            System.out.print("*");
        System.out.println();

        boolean guessedCorrectly;
        String choicelist = " ";


        while (true)
        //Checking the input for difference letters or words from numbers
        {
            while (!scanner.hasNext("[a-zA-Z\\s]*")) {
                System.out.println("That's not an appropriate symbol! Please type a letter or a word to guess a word");
                scanner.next();
            }
            String input = scanner.next();

            guessedCorrectly = true;

            String choice = input;


            choicelist += choice;

            for (int i = 0; i < numChars; i++) {
                boolean correctGuess = false;
                for (int j = 0; j < choicelist.length(); j++) {
                    if (secretWord.charAt(i) == choicelist.charAt(j)) {
                        System.out.print(secretWord.charAt(i));
                        correctGuess = true;
                        break;
                    }
                }
                if (correctGuess == false) {
                    System.out.print("*");
                    guessedCorrectly = false;
                }
            }
            if (guessedCorrectly == true)
                break;
            System.out.println();
        }

        System.out.println(" You have guessed the word");
    }
}


