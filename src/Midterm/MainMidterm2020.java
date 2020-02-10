package Midterm;

import java.util.Arrays;

public class MainMidterm2020 {

    public static void main(String[] args) {

        midterm2020 midterm = new midterm2020();

        /*1.
        Create a method to return missing smallest positive integer (greater than 0) from given array.
        Example:
        For array : [1,3,5,4,2,7]
        Method should return : 6
        For array : [-1, -3, 4, 2]
        Method should return : 1
        For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
        Method should return : 6*/



        int[] array1 = {1,3,5,4,2,7};

        int n1 = array1.length;

        System.out.println("\nAnswer to question no.1: ");

        System.out.println("\n1A.Missing Minimum Array: " + (midterm.missingMinimumArray(array1)));

        int[] array2 = {-1, -3, 4, 2};

        int n2 = array2.length;

        System.out.println("\n1B.Missing Minimum Array: " + (midterm.missingMinimumArray(array2)));

        int[] array3 = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};

        int n3 = array3.length;

        System.out.println("\n1C.Missing Minimum Array: " + (midterm.missingMinimumArray(array3)));



        /*2.
        Write a Java program to remove a specific element from an array.
        Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
        New Array: [32, 14, 98, 56, 148, 78]*/

        int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};


        System.out.println("\n\n\nAnswer to question no.2: ");

        int[] newArray = midterm.removeSpecificElement(originalArray, 24);

        System.out.println("\nNew Array: " + Arrays.toString(newArray));



        /*3.
        Scenario: Traffic ticketing system
        1. Speed Limit = 70
        2. Every 5 miles over the speed limit will add 1 point
        3. Use Math.floor(1.4)to round the speed to downward value
        4. If user reaches 12 points then license is suspended
        Example:
        userspeed=78(70-75->1point)
        userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)*/

        System.out.println("\n\n\nAnswer to question no.3: ");

        String result = midterm.trafficTicketingSystem(60,70);

        System.out.println("\n3.Result: " + (result));

    }

    }

