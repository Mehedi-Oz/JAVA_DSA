package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.print("Enter Operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Two Numbers: ");
                int x = in.nextInt();
                int y = in.nextInt();

                if (op == '+') {
                    System.out.println(x + y);
                } else if (op == '-') {
                    System.out.println(x - y);
                } else if (op == '*') {
                    System.out.println(x * y);
                } else if (op == '/') {
                    System.out.println(x / y);
                } else if (op == '%') {
                    System.out.println(x % y);
                }
            } else if (op == 'X' || op == 'x') {
                System.out.print("Program Terminated!");
                System.out.println(" ");
                break;
            } else {
                System.out.print("Enter A Valid Operator!");
                System.out.println(" ");
            }
        }
    }
}
