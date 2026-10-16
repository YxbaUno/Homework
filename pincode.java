//pincode
import java.util.Scanner;
class pincode {
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

    }
}