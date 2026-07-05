package com.smmazibuko;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Welcome to smMazibuko's Number Guesser!");

        Random randomGenerator = new Random();
        int finalAnswer = randomGenerator.nextInt(0, 31);
        Scanner userInput = new Scanner(System.in);
        int userAnswer = -1;

        System.out.println("Please guess a number between 0 and 30:");

        while (userAnswer != finalAnswer){

            userAnswer = userInput.nextInt();
            userInput.nextLine();

            checkUserAnswer(userAnswer, finalAnswer);

        }

        userInput.close();

    }

    static void checkUserAnswer(int guess, int answer){

        if (guess < answer) System.out.println("Guess higher");
        if (guess > answer) System.out.println("Guess lower");
        if (guess == answer) System.out.println("Correct! The answer was " + answer);

    }

}
