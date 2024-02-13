package lesson__7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //create and init variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int number = random.nextInt();
            int countr = 0;
            int answer = -1;
            //main game loop;
            while (answer != number && countr < 3) {
                countr++;
                System.out.println("Guess the number [0..9]:");
                answer = scanner.nextInt();
                if (answer < number) {
                    System.out.println("Your number is less");

                } else if (answer > number) {
                    System.out.println("Your number is greater");

                }
            }
            //to show result of game
            if (answer == number) {
                System.out.println("You WIN!");

            } else {
                System.out.println("You LOSE ! It was" + number);
            }
            System.out.println("Play again?[1-yes,0-no:");

        } while (scanner.nextInt() == 1);


    }
}
