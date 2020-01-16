package Homework_7;

public class methodReverse {

/*Create methods to :
*    1.  Reverse a string
*        Eg: Input to method : Sample
*        Output/Return from method : elpmaS */

    public static void main(String[] args) {


        String reverse = "Sample";
        int stringLength = reverse.length();
        String reversed = "";


        for (int i = 0; i <=stringLength - 1; i++){

            reversed = reversed + reverse.charAt(stringLength - 1 - i);

        }

        System.out.println("Input to method: Sample");
        System.out.println();
        System.out.println("Output from method is: " + reversed);
    }
}
