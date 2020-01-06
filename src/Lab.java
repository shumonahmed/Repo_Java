
//Scanner
import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Are you in NY ");
//        String userName = scan;
//        boolean whereAreYou = scan.nextBoolean();
//
//        System.out.println("Are you in NY: " + whereAreYou);

//          int number = 100;
//          if (number % 15 == 0)
//              System.out.println("Divisible fby 15");
//          else
//             System.out.println(number%15);

//        boolean GuestOneVegan = true;
//        boolean GuestTwoVegan = true;
//
//        if (GuestOneVegan && GuestTwoVegan)
//            System.out.println("Only Veg. ");
//        else if (GuestOneVegan || GuestTwoVegan)
//            System.out.println("Some Veg. menu ");
//        else
//            System.out.println("Anything from the menu ");

        // print the names using for loop
//        String [] words = {"Dhaka", "Vienna", "New York", "Mumbai"};

//        words [0] = "Dhaka";
//        words [1]= "Vienna";
//        words [2]= "New York";
//        words [3]= "Mumbai";
//
//        for ( int i = 0; i <= words.length -1; i++)
//        {
//            System.out.println(words[i]);
//        }


        //String [] words = {"grow", "help", "learn", "happy"}
        //print words with length greater than 4

        String [] words = {"grow", "help", "learn", "happy"};

        words [0] = "grow";
        words [1] = "help";
        words [2] = "learn";
        words [3] = "happy";
        System.out.println(words.length);
//
//        for (int i = 0; i >=words.length - 1; i++);
//
//        if (words 4) {
//
//            System.out.println(words[i]);
//        }
//        else {
//
//            System.out.println("Ignore");
//        }
        for (int i = 0; i <= words.length - 1; i++)

        if (words[i].length() >4){

            System.out.println(words[i]);

        }




    }




}
