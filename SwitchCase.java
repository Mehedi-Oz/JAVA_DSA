package src;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Very tasty fruit Mango!");
                break;
            case "Apple":
                System.out.println("A red fruit Apple!");
                break;
            case "Orange":
                System.out.println("Sweet orange fruit Orange!");
                break;
            case "Grape":
                System.out.println("A small fruit Grape!");
                break;
            case "Banana":
                System.out.println("A yellow fruit Banana!");
                break;
            default:
                System.out.println("!Enter a valid fruit!");
        }
    }
}
