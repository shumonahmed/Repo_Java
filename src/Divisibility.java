import java.util.Scanner;

public class Divisibility {

    /*
    3. Store a number in an int variable.
    if the number is divisible by 15
	Display "Divisible by 15"
    Otherwise
	Display the remainder you get when divide number by 15
    */


       public static void main(String[] args) {
//
//            //take input from keyboard
            Scanner input = new Scanner(System.in);

            int number = 0;
            int remainder = 0;


            System.out.println("Enter number:");
            number = input.nextInt();
            remainder = number % 15;


            if(remainder == 0){

                System.out.println("Divisible by 15");
            }
            else {

                System.out.println(number + " is not divisible by 15.");
                System.out.println("Remainder: " + remainder);
            }


    //Deepak's example

//    int number = 62;
//    int divisibleBy = 15;
//    int remainder = number % divisibleBy;
//        if(remainder == 0) {
//        System.out.println("Divisible by " + divisibleBy);
//    } else {
//        System.out.println("Remainder after dividing " + number + " by " + divisibleBy + ": " + remainder);

//           int number = 44;
//           int divisibleBy = 15;
//           int remainder = number % divisibleBy;
//
//           if (remainder == 0) {
//
//               System.out.println("Divisible by: " + divisibleBy);
//           }else {
//
//               System.out.println("Remainder after diving " + number + " by " + divisibleBy + ": " + remainder);
//           }
    }
}





