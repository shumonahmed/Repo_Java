package utility;

/*
1)
String myStatment = "I am a good programmer";
Use string methods to do following tasks:
	Extract "Programmer" string from myStatement.
	Display the total number of words in the myStatement.
	replace all the 'r' characters with 'f' characters.
2)
Store your name in a string variable.
Calculate the length of your name, without using length() method of String class.
3)
String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
Verify if "JOHN" is present at index 1.
4)
Array:
Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    1. Length of that array
    2. Print name written on 3rd position (hint: 2nd index)
    3. Name of each friend/colleague
    4. Does name on 2nd position, start with "A"
 */

public class HomeWorkStringTwo {

    public static void main(String[] args){

       /*String myStatment = "I am a good programmer";

      // Extract "Programmer" string from myStatement.

        int len = myStatment.length();

        System.out.println("Length: "  + len);
        System.out.println("First char: " + myStatment.charAt(0));
        System.out.println("Last char: " + myStatment.charAt(len - 1));
        System.out.println(myStatment.charAt(12));

        String prog = myStatment.substring(12);
        System.out.println(prog);

        String replacedString = myStatment.replace('r', 'f');
        System.out.println(replacedString);*/

        //String x = "I am a good programmer";
       // String y[] = x.split(" ");
        //System.out.println(y.length);

       /*String first_name = "Abul";
       String middle_name = "Hasnat";
       String family_name = "Ahmed";
       System.out.println(first_name + " " + middle_name + " " + family_name);



       String str1 = "Mohammad, John, Ferdous , Abul , Ratna , Mareeha , Ruslan , Himani";
       String str2 = "JOHN";*/


       String x = "Abul Hasnat Ahmed";
       x = x.concat("\0");

       char y[] = x.toCharArray();

       int count=0;
       int i=0;
       while (y[i]!='\0')
       {

           ++count;
           ++i;

       }

        System.out.printf("%d" ,count);









    }
}
