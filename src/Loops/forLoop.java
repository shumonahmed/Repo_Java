package Loops;

public class forLoop {

    public static void main(String[] args) {

        //count upto 100

//        for (int i = 0; i <= 100; i++) {
//
//            System.out.println(i);
//        }
        //1. Write a logic that uses a for loop to display numbers in descending
        // order in the step of 5 starting from 100.

//        for (int i = 100; i > 0; i = i - 5){
//
//            System.out.println(i);

        //Write logic that revers string



                //demhA
//        String name= "Ahmed";
//        String reversedString = "";
//
//        char [] strArr = name.toCharArray(); // [A,h,m,e,d]
//
//        for (int i = strArr.length - 1; i >= 0; i --) {
//
//            reversedString = reversedString + strArr [i];
//
//        }
//
//        System.out.println(reversedString);


        //Write a logic that checks for palindrome

        String name = "racecar";
        String reversedString = "";

        char [] strArr = name.toCharArray();

        for(int i =strArr.length - 1; i >= 0; i--) {

            reversedString = reversedString + strArr [i];

        }
        System.out.println(reversedString);
        System.out.println(name.equals(reversedString));

        }
    }




