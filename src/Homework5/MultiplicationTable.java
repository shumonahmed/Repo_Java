//2. Write a logic that prints multiplication table of the user provided number up  to ten.

package Homework5;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int x = 0;

        System.out.println("Multiplication Table (Enter number):  ");
        number = input.nextInt();

        System.out.println("To (Enter number):  ");
        x = input.nextInt();

        System.out.println(number + " Up to " + x + ":");
        for (int i = 0; i <=  x; i++){

            System.out.println(number + " x " + i + " = " + number*i);

        }
    }
}
