//guessing number

import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correct = 6;
        int guess = 0;
        int attempts = 0;
        while (guess != correct) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > correct) {
                System.out.println("Lower");
            } else if (guess < correct) {
                System.out.println("Higher");
            }
        }
        System.out.println("Correct! You needed " + attempts + " attempts");

    }
}
