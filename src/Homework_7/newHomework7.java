package Homework_7;

import java.util.Arrays;

public class newHomework7 {

    public static void main(String[] args) {

        //instance of Utility
        Utility utility = new Utility();

        //initialization

        String string = "Sample";

        int[] arr = {25, 15, 3, 2, 40};

        int [] array = {20, 10, 40, 44};

        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};

        String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};


        //1. reverse String
        System.out.println("1.Reversed String: " + (utility.reverseString(string)));


        //2. reverse an array
        System.out.println("\n2.Reversed Array: " + (Arrays.toString(utility.reverseArray(arr))));


        //3.Sum of Array Elements
        System.out.println("\n3.Sum of an Array: " + (utility.sumOf(array)));


        //4. sort an array
        System.out.println("\n4.Sort an Array: " + (Arrays.toString(utility.sort(arr))));


        //5.Find the average of a given array
        System.out.println("\n5.Average of a given Array: " + (utility.findAverageOf(array)));


        //6.Find maximum number in given array
        System.out.println("\n6.Maximum Array: " + (utility.maximum(arr)));


        //7.Find minimum number in given array
        System.out.println("\n7.Minimum Array: " + (utility.minimum(arr)));


        //8.Create abbreviation for any string
        System.out.println("\n8.Abbreviation: " + (utility.abbreviationOf("Central Intelligence Agency")));


        //9.Create fibonacci series for given start number and given length of series
        System.out.println("\n9.Fibonacci series: ");
        utility.fibonacci(2,3,5);


        //10.Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array
        System.out.println("\n10.Maximum mark: " + (utility.maximumMarksGetter(sMarks, sNames)));


        //11.Create a method to add numbers from 0 to given number, and return the result
        System.out.println("\n11.Add number: " + (utility.addUpTo(11)));

}

}
