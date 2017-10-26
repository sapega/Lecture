package com.playtika.strings;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        System.out.println("Please type: Мама мыла раму.");
        Scanner scanner = new Scanner(System.in);

        String readString = scanner.nextLine();

        String reverse = new StringBuffer(readString).reverse().toString();
        System.out.println("The reserve word spelling: "+reverse);

        String[] newLineString = readString.split("\\s");
        for (String s : newLineString) {
            System.out.println("Each word from new line: "+s);
        }
        String replace = readString.replace(" ", "*");
        System.out.println("The replace of symbols: "+replace);

        String upperCase = readString.toUpperCase();
        System.out.println("Sentence in upper case:  "+upperCase);
        try {
            String subString = readString.substring(5, 10);
            System.out.println("Part of a sentence: "+subString);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please type: Мама мыла раму.");
        }
    }
}

