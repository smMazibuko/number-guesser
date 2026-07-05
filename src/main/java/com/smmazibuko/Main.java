package com.smmazibuko;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Welcome to smMazibuko's Number Guesser!");

        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);

        int upperLimit = 20;
        int finalAnswer = randomGenerator.nextInt(0, upperLimit + 1);
        int userAnswer = -1; // sentinel value

        System.out.println("Please guess a number between 0 and " + upperLimit + ":");

        while (userAnswer != finalAnswer){

            userAnswer = getUserAnswer(myScanner);
            compareAnswer(userAnswer, finalAnswer);

        }

        myScanner.close();

    }

    static int getUserAnswer(Scanner scanner){

        int userAnswer = scanner.nextInt();
        scanner.nextLine();

        // user input will be validated here

        return userAnswer;
    }

    static void compareAnswer(int guess, int answer){

        if (guess < answer) System.out.println("Guess higher");
        if (guess > answer) System.out.println("Guess lower");
        if (guess == answer) System.out.println("Correct! The answer was " + answer);

    }

}
