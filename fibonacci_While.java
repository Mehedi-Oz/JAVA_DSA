package src;

import java.util.Scanner;

public class fibonacci_While {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter nth position: ");
        int n = getInput.nextInt();

        int count = 2, first = 0, second = 1;

        while (count <= n) {
            int fibo = second;
            second = first + second;
            first = fibo;
            count++;
        }

        System.out.println();
    }
}
