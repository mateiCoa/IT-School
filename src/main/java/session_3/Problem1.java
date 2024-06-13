package session_3;

import java.util.Scanner;

public class Problem1 {

    /*
    Write a Java program to find the remainder of two integers x and y using the modulus operator.
    Also, compute the result of x raised to the power of y using the Math.pow function.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int x = sc.nextInt();

        System.out.println("Please enter second number:");
        int y = sc.nextInt();

        int remainder = x % y;
        double power = Math.pow(x, y);

        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);
    }
}