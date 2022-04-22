package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner key = new Scanner(System.in);
        System.out.println("Enter text here :  ");
        String text = key.nextLine();

        int words = 0;
        words += new StringTokenizer(text).countTokens();

        int letters = 0;
        for (char i: text.toCharArray()) {
            int spaces = 0;
            if (i == ' ') {
                spaces++;
            }
            if (Character.isLetter(i)) {
                letters++;
            }
        } int sentences = 0;
        sentences = text.split("[.]").length;

        double L = ((double) letters / (double) words) * 100;
        double S = ((double) sentences / (double) words) * 100;
        double CLI = 0.0588 * L - 0.296 * S - 15.8;

        System.out.println("Total letters: " + letters);
        System.out.println("Total words: " + words);
        System.out.println("Total sentences: " + sentences);
        System.out.println("CLI: " + CLI);
    }
}
