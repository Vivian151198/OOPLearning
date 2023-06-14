package exercise;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("I'm thinking of a number between 1 and 100");
        boolean userWantPlayGameAgain = true;
        do {
            startGame();
            Scanner playGameAgain = new Scanner(System.in);

            System.out.println("Do you want play game again?");
            String userInput = playGameAgain.next();
            if (userInput.equals("yes")) {
                userWantPlayGameAgain = true;
            } else {
                userWantPlayGameAgain = false;
            }

        } while (userWantPlayGameAgain);

    }

    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void startGame() {
        int randomNumber = getRandomNumber(0, 100);
        System.out.println(randomNumber);
        Scanner guessNumber = new Scanner(System.in);
        int count = 0;
        boolean playerGuessedCorrect = false;
//        System.out.println(playerGuessedCorrect);
//        System.out.println(!playerGuessedCorrect);
//        System.out.println(playerGuessedCorrect == false);
        while (!playerGuessedCorrect) {
            System.out.println("Take a guess:");
            int number = guessNumber.nextInt();
            count++;
            if (number > randomNumber) {
                System.out.println("Too high");
            } else if (number < randomNumber) {
                System.out.println("Too low");
            } else {
                playerGuessedCorrect = true;
            }
        }
        System.out.printf("Congratulation!!You guessed the correct number in %d attempts\n", count);
    }
}
