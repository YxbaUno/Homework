// infinity loop

import java.util.Scanner;
class infifniyloop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = 1;
        System.out.print("Write Input: ");
        int i = scanner.nextInt();
        System.out.println(one);
        while (one <= i++) {
            one++;
            System.out.println(one);
        }


    }
}