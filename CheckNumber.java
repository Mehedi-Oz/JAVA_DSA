package src;

import java.util.Scanner;

public class CheckNumber {
    private static int mods;

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = getInput.nextInt();

        int temp = x, mods, rev = 0;

        while (temp != 0) {
            mods = temp % 10;
            rev = rev * 10 + mods;
            temp = temp / 10;
        }

        System.out.println("Reverse of given number is " + rev);
    }
}
