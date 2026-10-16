// statistics of numbers

import java.util.Scanner;

public class statistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter number 4: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter number 5: ");
        int number5 = scanner.nextInt();
        System.out.print("Enter number 6: ");
        int number6 = scanner.nextInt();
        System.out.print("Enter number 7: ");
        int number7 = scanner.nextInt();
        System.out.print("Enter number 8: ");
        int number8 = scanner.nextInt();
        System.out.print("Enter number 9: ");
        int number9 = scanner.nextInt();
        System.out.print("Enter number 10: ");
        int number10 = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        if (number1 > 0) {
            positive++;
        }
        if (number2 > 0) {
            positive++;
        }
        if (number3 > 0) {
            positive++;
        }
        if (number4 > 0) {
            positive++;
        }
        if (number5 > 0) {
            positive++;
        }
        if (number6 > 0) {
            positive++;
        }
        if (number7 > 0) {
            positive++;
        }
        if (number8 > 0) {
            positive++;
        }
        if (number9 > 0) {
            positive++;
        }
        if (number10 > 0) {
            positive++;
        }
        if (number1 < 0) {
            negative++;
        }
        if (number2 < 0) {
            negative++;
        }
        if (number3 < 0) {
            negative++;
        }
        if (number4 < 0) {
            negative++;
        }
        if (number5 < 0) {
            negative++;
        }
        if (number6 < 0) {
            negative++;
        }
        if (number7 < 0) {
            negative++;
        }
        if (number8 < 0) {
            negative++;
        }
        if (number9 < 0) {
            negative++;
        }
        if (number10 < 0) {
            negative++;
        }
        if (number1 == 0) {
            zero++;
        }
        if (number2 == 0) {
            zero++;
        }
        if (number3 == 0) {
            zero++;
        }
        if (number4 == 0) {
            zero++;
        }
        if (number5 == 0) {
            zero++;
        }
        if (number6 == 0) {
            zero++;
        }
        if (number7 == 0) {
            zero++;
        }
        if (number8 == 0) {
            zero++;
        }
        if (number9 == 0) {
            zero++;
        }
        if (number10 == 0) {
            zero++;
        }
        if (number1 % 2 == 0) {
            even++;
        }
        if (number2 % 2 == 0) {
            even++;
        }
        if (number3 % 2 == 0) {
            even++;
        }
        if (number4 % 2 == 0) {
            even++;
        }
        if (number5 % 2 == 0) {
            even++;
        }
        if (number6 % 2 == 0) {
            even++;
        }
        if (number7 % 2 == 0) {
            even++;
        }
        if (number8 % 2 == 0) {
            even++;
        }
        if (number9 % 2 == 0) {
            even++;
        }
        if (number10 % 2 == 0) {
            even++;
        }
        if (number1 % 2 != 0) {
            odd++;
        }
        if (number2 % 2 != 0) {
            odd++;
        }
        if (number3 % 2 != 0) {
            odd++;
        }
        if (number4 % 2 != 0) {
            odd++;
        }
        if (number5 % 2 != 0) {
            odd++;
        }
        if (number6 % 2 != 0) {
            odd++;
        }
        if (number7 % 2 != 0) {
            odd++;
        }
        if (number8 % 2 != 0) {
            odd++;
        }
        if (number9 % 2 != 0) {
            odd++;
        }
        if (number10 % 2 != 0) {
            odd++;
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
