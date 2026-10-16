//even

import java.util.Scanner;
class even {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write Input: ");
        int i = scanner.nextInt();
        int one = 1;
        while (one <= i) {
            if (one++ % 2 != 0) {
                System.out.println(one);
            }
        }


    }
}