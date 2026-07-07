package com.smmazibuko;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Welcome to smMazibuko's Number Guesser!");

        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);

        int upperLimit;
        int userAnswer = -1; // sentinel value

        System.out.println("What difficulty would you like to try?\n[ 1 | 2 | 3 ]");
        upperLimit = getUpperLimit(myScanner);

        int finalAnswer = randomGenerator.nextInt(0, upperLimit + 1);

        System.out.println("Please guess a number between 0 and " + upperLimit + ":");

        while (userAnswer != finalAnswer) {

            userAnswer = getUserAnswer(myScanner);
            compareAnswer(userAnswer, finalAnswer, upperLimit);
        }

        myScanner.close();
    }

    static int getUpperLimit(Scanner scanner) {

        int userInput = -1;
        int limit = 0;

        while (!(userInput >= 1 && userInput <= 3)) {
            try {
                userInput = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        }

        limit = switch (userInput) {
            case 3 -> 100;
            case 2 -> 50;
            default -> limit;
        };

        return limit;
    }

    static int getUserAnswer(Scanner scanner) {

        try {
            int userAnswer = scanner.nextInt();
            scanner.nextLine();
            return userAnswer;
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }

    }

    static void compareAnswer(int guess, int answer, int bound) {

        // valid input options
        if (guess < answer && guess >= 0)
            System.out.println("Guess higher");
        if (guess > answer && guess <= bound)
            System.out.println("Guess lower");
        if (guess == answer)
            System.out.println("Correct! The answer was " + answer + ".");

        // invalid inputs
        if (guess > bound)
            System.out.println("Too high. Guess a number between 0 and " + bound + ".");
        if (guess < 0)
            System.out.println("Invalid input. Please try again.");

    }

}
