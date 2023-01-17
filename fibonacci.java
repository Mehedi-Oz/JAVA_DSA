package src;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nth position: ");
        int n = input.nextInt();

        int i, first = 0, second = 1;

        if (n == 0) {
            System.out.println(" -> 0");
        } else
            for (i = 1; i < n; i++) {
                int fibo = first + second;
                first = second;
                second = fibo;
            }

        System.out.println();
    }
}
