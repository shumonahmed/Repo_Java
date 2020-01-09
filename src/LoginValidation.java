import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        //**
// * Test Cases
// * 1. Verify username & password is correct scenario

// * Homework:
// * 1. Create a system that checks valid username and password
// * And if they both are valid then only system displays homepage
// * User can only try up-to 5 times with invalid login details
// * if it reaches 5 times then system should be locked for 10 min
// * 2. Fix existing bug from the system
// * 3. Write test cases to validate the scenario

        Scanner input = new Scanner(System.in);

        int n = 5; // maximum number of try
        int numberOfTry = 1; // trying for the first time
        int count = 0; // initializing
        boolean isMaximum = false; // have not reached maximum times of try yet

        System.out.println("Enter valid username: ");
        String username = input.nextLine();

        System.out.println("Enter valid password: ");
        String password = input.nextLine();

        String correctedUsername = "Shumon";
        String correctPassword   = "Passaic";

        for (int i = 1; i <= n; i++) {

            count = n - numberOfTry;

            if ((!username.equals(correctedUsername)) || ((!password.equals(correctPassword)))) {

                if (numberOfTry == n){
                    isMaximum = true;
                    break;
                }

                System.out.println("You have " + count + " " + "more chance");
                System.out.println();

                System.out.println("Enter username again: ");
                username = input.nextLine();

                System.out.println("Enter password again: ");
                password = input.nextLine();

                numberOfTry++;

            } else {
                System.out.println("Welcome to homepage");
                break;
            }
        }

        if (isMaximum){

            System.out.println("Your system will be locked for 10 min");
        }
    }
}



