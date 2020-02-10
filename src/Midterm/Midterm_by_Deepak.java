package Midterm;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Midterm_by_Deepak {

        public static void main(String[] args) {

            int[] anotherSetOfNumbers = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24, 56, 78};
            //int[] anotherSetOfNumbers = {1, 2, 4, 3, 1, 6, 1};

            /**
             * Create a method using Java to remove a specific value from a given int array.
             * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
             * New Array: {32, 14, 98, 56, 148, 78}
             *
             * Original array: {1, 2, 4, 3, 1, 6, 1}    Remove: 1
             * New Array: {2, 4, 3, 6}
             */
            System.out.println("\n\nQuestion 1:");
            int[] newArrayAfterRemovingNum = removeSpecificInt(anotherSetOfNumbers, 14);
            System.out.println("New Array:      " + Arrays.toString(newArrayAfterRemovingNum));


            /**
             * Create a method to return missing smallest positive integer (greater than 0) from given array.
             * Example:
             * 	For array : [1,3,5,4,2,7]
             * 	Method should return : 6
             * 	For array : [-1, -3, 4, 2]
             * 	Method should return : 1
             * 	For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
             * 	Method should return : 6
             */
            System.out.println("\n\nQuestion 2:");
            System.out.println("Given int array: " + Arrays.toString(anotherSetOfNumbers));
            System.out.println("Smallest missing positive int: " + findMinMissingPositiveInt(anotherSetOfNumbers));


            /**
             * Scenario: Traffic ticketing system
             *    1. Speed Limit = 70
             *    2. Every 5 miles over the speed limit will add 1 point
             *    3. Use Math.floor(1.4)to round the speed to downward value
             *    4. If user reaches 12 points then license is suspended
             *
             *  Example:
             *      user speed = 78 (70-75 -> 1 point)
             *      user speed = 88 (70-75 -> 1 point, 75-80 -> 1 point, 80-85 -> 1 point)
             */
            System.out.println("\n\nQuestion 3:");
            calculatePoints(178);

        }


        public static int[] removeSpecificInt(int[] originalArray, int valueToRemove) {
            int count = 0;
            int originalArrayLength = originalArray.length;
            System.out.println("Original array: " + Arrays.toString(originalArray));
            for (int num : originalArray) {
                if(num==valueToRemove) {
                    count++;
                }
            }
            int[] newArray = new int[originalArrayLength - count];
            int index = 0;
            for (int i=0; i<originalArrayLength;i++) {
                if(originalArray[i] != valueToRemove) {
                    newArray[index] = originalArray[i];
                    index++;
                }
            }
            return newArray;
        }

        public static int findMinMissingPositiveInt(int[] arr) {
            int check = 1;
            for (int i=0 ; i<arr.length ; i++) {
                if(arr[i] == check) {
                    check++;
                    i = -1;
                    continue;
                }
            }
            return check;
        }

        public static int calculatePoints(double yourSpeed) {
            double speedLimit = 70;
            double extraSpeed = yourSpeed - speedLimit;
            DecimalFormat df = new DecimalFormat("#.##");
            int points = 0;
            System.out.println("Your speed: " + df.format(yourSpeed) + "mph");
            System.out.println("Speed limit: " + speedLimit + "mph");
            if (extraSpeed > 0) {
                System.out.println("You were going " + df.format(extraSpeed) + "mph over the speed limit.");
                points = (int)extraSpeed/5;
                System.out.println("** You get " + points + " points against your license.**");
                if (points >= 12) {
                    System.out.println("As points were more than 12, Your license suspended.");
                }
            } else {
                System.out.println("Thank you for driving within the speed limit.");
            }
            return points;
        }

    }

