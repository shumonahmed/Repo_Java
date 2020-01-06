//3. Write a logic that checks if a number is a Prime number

package Homework5;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        boolean PrimeNumber = true;

        System.out.println("Enter a Number: ");
        number = input.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++){

            if (number % i == 0){

                PrimeNumber = false;
                break;
            }
        }
        if (PrimeNumber){

            System.out.println(number + " is a prime number ");

        }else {

            System.out.println(number + " is not a prime number ");
        }
    }
}
