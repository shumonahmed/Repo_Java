public class HomeworkSecond {


    public static void main(String[] args) {

        /*1)
       String myStatment = "I am a good programmer";
       Use string methods to do following tasks:
       Extract "Programmer" string from myStatement.*/


        String myStatment = "I am a good programmer";

        int len = myStatment.length();

        String prog = myStatment.substring(12);
        System.out.println(prog);

        //Display the total number of words in the myStatement.

        String myStatement = "I am a good programmer";
        String numberOfWords[] = myStatement.split(" ");
        System.out.println(numberOfWords.length);

        //replace all the 'r' characters with 'f' characters.

        String replacedString = myStatment.replace('r', 'f');
        System.out.println(replacedString);
        //2)
        //Store your name in a string variable.

        String first_name = "Abul";
        String middle_name = "Hasnat";
        String family_name = "Ahmed";
        String fullName = first_name + " " + middle_name + " " + family_name;
        System.out.println(fullName);

        //Calculate the length of your name, without using length() method of String class.

        String n = "Abul Hasnat Ahmed";
        n = n.concat("\0");

        char a[] = n.toCharArray();

        int count=0;
        int i=0;
        while (a[i]!='\0')
        {

            ++count;
            ++i;

        }

        System.out.printf("%d" ,count);

        //3)
        //String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
        //Verify if "JOHN" is present at index 1.

        String [] name = new String[8];
        name[0]="Mohammad";
        name[1]="John";
        name[2]="Ferdous";
        name[3]="Abul";
        name[4]="Ratna";
        name[5]="Mareeha";
        name[6]="Ruslan";
        name[7]="Himani";

        boolean index1 = true;
        System.out.println("Is \"John\" present at index 1 : " + name[1].equalsIgnoreCase("JOHN"));



        //4)
        //Array:
        //Store first names of 5 of your friends/colleagues in an array, and display the following in console:
        //1. Length of that array

        String[] friends = new String[5];

        friends[0] = "Micheal";
        friends[1] = "Andrey";
        friends[2] = "Mithu";
        friends[3] = "Chadi";
        friends[4] = "Jan";


        int size = friends.length;
        System.out.println(friends.length);



        //2. Print name written on 3rd position (hint: 2nd index)

        System.out.println("Name on third position is:" + friends[2]);


        //3. Name of each friend/colleague



        //4. Does name on 2nd position, start with "A"

        boolean secondPosition = friends[1].startsWith("A");
        System.out.println("Dose name on 2nd position, start with A:"   +  secondPosition);











    }
}
