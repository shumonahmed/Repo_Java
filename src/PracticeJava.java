///*Write a Java program to test a number is positive or negative.
//Test Data
//Input number: 35*/
//
import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {

//        int number;
//
//        //Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the number you want to check");
//        Scanner scan = new Scanner(System.in);
//        number = scan.nextInt();
//
//        if (number/2) {
//            System.out.println("Number is Positive");
//        } else if (number < 0) ;
//        {
//            System.out.println("Number is Negative");
//        }
//
//            System.out.println("neither Positive or Negative");

        //count upto 100

//        int count = 100;
//
//        while (count >= 0){
//
//            System.out.println("Count: " + count);
//            count--;

//        }

        //count upto 100 from 0 and print only the even numbers
//
//        int count = 0;
//
//        while (count <= 100){
//
//            if (count % 2 == 0){
//                System.out.println(count);
//            }
//
//            count++;


//
//            System.out.println(Math.sqrt(81));
//
//
//
//
// }
//
//        String myString = "technosoft";
//        int stringlen = myString.length();
//        String reversed = "";
//
//
//        //        charAt()
////                reversed = reversed + myString.charAt(stringlen - 1 -0);
////                reversed = reversed + myString.charAt(stringlen - 1 -1);
////                reversed = reversed + myString.charAt(stringlen - 1 -2);
////                reversed = reversed + myString.charAt(stringlen - 1 -3);
////                reversed = reversed + myString.charAt(stringlen - 1 -4);
////                reversed = reversed + myString.charAt(stringlen - 1 -5);
////                reversed = reversed + myString.charAt(stringlen - 1 -6);
//
//        //reverse = 7
//        // i = 0
//        // i <= len - 1
//        //i++
//
//        for (int i = 0; i <= stringlen -1; i++) {
//
//            reversed = reversed + myString.charAt(stringlen - 1 - i);
//
//        }
//
//        System.out.println(reversed);

//        int [] mark = { 10, 20, 30};
//        for (int mrk : mark){
//
//            System.out.println("Mark :" + mrk);
//        }
//    }

//        calculateResult(20,30);
//
//
//}
//
//    public static void calculateResult(int subOne, int subTwo) {
//
//        System.out.println("Total marks from this sem");
//        System.out.println(subOne+subTwo);
//        System.out.println(subOne-subTwo);

        /* Take user input for Fans name and
        based on name, print his/her favorite sports name

        *Football
        Deepak

        *Soccer
        Ani, Rana

        *Cricket
        Ferdous, Delwar, Ahsan

        Basketball
        Palina, Mark, Mareeha, Rovshan

        *Not a Fan of Sports
        Shumon, Himani
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a name to find this persons favorite sport: ");

        String centerName = scan.nextLine();

        switch (centerName){

            case "Deepak":
                System.out.println(centerName + ",s " + "favorite sport is football");
                break;
            case "Ani":
            case "Rana":
                System.out.println(centerName + ",s " + "favorite sport is Soccer");
                break;
            case "Ferdous":
            case "Delwar":
            case "Ahsan":
                System.out.println(centerName + ",s " + " Favorite sport is Cricket");
                break;
            case "Palina":
            case "Mark":
            case "Mareeha":
            case "Rovshan":
                System.out.println(centerName + ",s " + "Favorite sport is Baseball");
                break;
            case "Shumon":
            case "Himani":
                System.out.println(centerName + " is " + "not a fan of sports");
                break;

        }
    }

    //    public static int sum(int a, int b,int d){
//
//
//        int c;
//
//        c=a+b+d;
//
//
//
//        return c;
//
//    }
//    public static int avar(int a,int b){
//        int v;
//        v=(a+b)/2;
//        return v;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(avar(22,4));

//        System.out.println(sum(2,4,6));
}










