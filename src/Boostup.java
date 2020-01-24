public class Boostup {

    public static void main(String[] args) {

        int age = 21;
        String myString = "I AM a student";
        String myString2 = "I am a student";
        double price = 20.00;
        boolean isBlank = myString.isEmpty();
        char trainName = '7';
        int lengthOfMyString = myString.length();
        boolean isEqual = myString.equals(myString2);
        boolean isEqualIgnoreCase = myString.equalsIgnoreCase(myString2);
        char findLetter = myString.charAt(2);
        boolean anotherString = myString.toLowerCase().equals(myString2.toLowerCase());
        boolean anotherString2 = myString.toUpperCase().equals(myString2.toUpperCase());
        String upperCase = myString.toUpperCase();


        String[] arrayName = {"Rani", "Sami", "Raj"};

        int[] ageArray1 = {20,30,40};

        int[] ageArray = new int[3];
        ageArray[0]=20;
        ageArray[1]=30;
        ageArray[2]=40;

        //System.out.println(ageArray[1]);
        //ageArray[3]=50;
        //ageArray[4]=60;


        for(int k =0; k<ageArray.length; k++) {
            if(ageArray[k] > 30)

            System.out.println("We have students over 30 years");
            else
            System.out.println("We have students less than 30 years");
        }

        int guestCap = 30;
        int guestComing = 50;

        if (guestCap > guestComing){

            System.out.println();
        } else
            System.out.println();

        // System.out.println(upperCase);
        //System.out.println(isEqualIgnoreCase);

    }
}
