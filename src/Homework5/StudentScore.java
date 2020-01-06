//        Students score, total possible score
//        15/20 -> You got a C (75%)
//        A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

package Homework5;

import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int StudentsScore = 0;
        int TotalScore = 0;
        int Percentage = 0;
        char Grade = 0;

        System.out.println("Enter total possible score ");
        TotalScore = input.nextInt();

        System.out.println("Enter student score ");
        StudentsScore = input.nextInt();

        //calculate score in percentage

        Percentage = (StudentsScore*100/TotalScore);

        if (Percentage >= 0 && Percentage <= 59) {

            Grade = 'F';

        }else if (Percentage >= 60 && Percentage <=69){

            Grade = 'D';

        } else if (Percentage >= 70 && Percentage <=79){

            Grade = 'C';

        } else if (Percentage >=80 && Percentage <= 89){

            Grade = 'B';

        } else if (Percentage >= 90 && Percentage <= 100){

            Grade = 'A';
        } else {

            Grade = 0;

        }
        if (Grade !=0){

            System.out.println(StudentsScore  +  "/"  +  TotalScore  +  ">>>"  +  "Your Score  "  +  Grade    +    "("  +  Percentage +"%" +  ")");

        } else {

            System.out.println("Not a valid grade");
        }

}
}
