//simple atm

import java.util.Scanner;
class simpleatm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correct = 1234;
        int attempts = 3;
        int pin = 0;
        while (pin != correct) {
            System.out.print("Enter PIN: ");
            pin = scanner.nextInt();
            if (pin != correct) {
                --attempts;
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left: " + attempts);

            }
            if (attempts == 0) {
                System.out.println("Incorrect PIN, no attempts left, card blocked");
                return;
            }

        }
        System.out.println("Loin successful");
        double balance = 1000.0;
        int choice = 0;
        while (choice != 4) {
            System.out.println("==== ATM MENU ====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("Your new balance is: $" + balance);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Not enough balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Wthdrawal successful.");
                        System.out.println("Your new balance is: $" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using Simple ATM!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }
}