package src;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        getArmStrong(input);
    }

    static void getArmStrong(int input) {
        int temp = 0, result = 0;
        temp = input;

        while (temp > 0) {
            int mod = temp % 10;
            result = result + mod * mod * mod;
            temp = temp / 10;
        }

        if (result == input)
            System.out.println("Given Number " + input + " Is A ArmStrong Number");
        else System.out.println("Given Number " + input + " Is Not A ArmStrong Number");
    }
}
