package src;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int n = in.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int count = 2;

        while (count * count <= n) {
            if (n % count == 0) {
                return false;
            }
            count++;
        }
        return count * count > n;
    }
}