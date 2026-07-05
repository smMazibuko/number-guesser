package com.smmazibuko;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Welcome to smMazibuko's Number Guesser!");

        Random randomGenerator = new Random();
        int finalAnswer = randomGenerator.nextInt(0, 51);
        Scanner userInput = new Scanner(System.in);
        int userAnswer;

        System.out.println("Please guess a number between 0 and 50:");
        userAnswer = userInput.nextInt();
        userInput.nextLine();

        if (userAnswer == finalAnswer) System.out.println("Correct! You guessed right.");
        if (userAnswer < finalAnswer) System.out.println("Guess higher");
        if (userAnswer > finalAnswer) System.out.println("Guess lower");

        System.out.println(finalAnswer); // for debugging purposes

    }
}
