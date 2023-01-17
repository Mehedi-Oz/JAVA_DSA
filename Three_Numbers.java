package src;

import java.util.Scanner;

public class Three_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maxi = a;

        if (b > maxi) {
            maxi = b;
        }
        if (c > maxi) {
            maxi = c;
        }

        System.out.println("\n" + maxi + " is largest number of all");
    }
}
