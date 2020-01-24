package PrepForMidterm;

import java.util.Arrays;

public class MidtermObject {

    public static void main(String[] args) {

        Midterm midterm = new Midterm();

        String string = "cooperation";

        int[] Array1= {25,15,3,2,49};

        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};

        String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};

        System.out.println("1.Reverse a String: " + (midterm.reverseS(string)));

        System.out.println("\n2.Reversed Array: " + (Arrays.toString(midterm.reverseAry(Array1))));

        System.out.println("\n3.Sum of Array: " + (midterm.sumOf1(Array1)));

        System.out.println("\n4.Sort an Array: " + (Arrays.toString(midterm.sort1(Array1))));

        System.out.println("\n5.Average is: " + (midterm.findAverageOf1(Array1)));

        System.out.println("\n6.Maximum number: " + (midterm.maximum(Array1)));

        System.out.println("\n7.Minimum number: " + (midterm.minimum(Array1)));

        System.out.println("\n8.Abbreviation: " + (midterm.abbreviationWord("Central Intelligence Agency")));

        System.out.println("\n9.Fibonacci series: ");
        midterm.fibonacci(2,3,5);

        System.out.println("\n10.Maximum Marks getter: " + (midterm.maximumMarksGetter(sMarks, sNames)));

        System.out.println("\n11.Sum: " + (midterm.addUpTo(7)));






    }
}
