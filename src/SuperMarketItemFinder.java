import java.util.Scanner;

public class SuperMarketItemFinder {


    public static void main(String[] args) {


        /* 6. Create a supermarket item finder
              Take input from user and based on the input, you should display user which aisle has the item
              For example: user enter milk, you program should say aisle 8. If the item is not found,
              display a message saying "Out of stock "Please create program for below requirement
                   Milk = Aisle Eight
                   Eggs = Aisle Eight
                   French Fries = Aisle seven
                   Candy = Aisle Three
                   Frozen Pizza = Aisle seven
                   Donuts = Aisle Eight
                   Diapers = Aisle One
                   Apple = Aisle two
                   Orange = Aisle two */


        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to this supermarket");
        System.out.println("What kind of grocery item would you like to know about?");
        String item = in.nextLine();

        switch (item) {

            case "Milk":
            case "Eggs":
            case "Donuts":

                System.out.println("You can find your item in: " + "Aisle Eight");
                break;

            case "French fries":
            case "Frozen Pizza":

                System.out.println("Aisle Seven");
                break;

            case "Candy":

                System.out.println("Aisle Three");
                break;

            case "Diapers":

                System.out.println("Aisle One");
                break;

            case "Apple":
            case "Orange":

                System.out.println("Aisle Two");
                break;

                default:
                System.out.println("Out of Stock");

        }
    }
}
