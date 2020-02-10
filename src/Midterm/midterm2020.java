package Midterm;

public class midterm2020 {

    public midterm2020(){

    }
        /*1.
            Create a method to return missing smallest positive integer (greater than 0) from given array.
            Example:
            For array : [1,3,5,4,2,7]
            Method should return : 6
            For array : [-1, -3, 4, 2]
            Method should return : 1
            For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
            Method should return : 6*/


            public int missingMinimumArray(int[] mArry){

                int arrayLength = mArry.length;

                for(int i = 0; i < arrayLength; i++){

                    if (mArry [i] > 0 &&  mArry [i] <= arrayLength){

                        if (mArry[i]-1 != i && mArry [mArry[i]-1] != mArry [i] ){

                            int temp = mArry[mArry[i]-1];

                            mArry[mArry[i]-1] = mArry[i];

                            mArry[i] = temp;

                            i--;
                        }
                    }
                }

                for (int i = 0;i < arrayLength; i++)

                    if(mArry[i]!= i + 1)

                        return i + 1;

                return arrayLength + 1;
            }



          /*  2.
                Write a Java program to remove a specific element from an array.
                Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
                New Array: [32, 14, 98, 56, 148, 78]*/

//          public int[] removeSpecificElement(int[] array){
//
//              int n = 0;
//              for (int i = 0; i < array.length; i++) {
//                  if (array[i] != 0)
//                      n++;
//              }
//
//              int[] newArray = new int[n];
//              int j=0;
//
//              for (int i = 0; i < array.length; i++) {
//                  if (array[i] != 0)
//                  {
//                      newArray[j]=array[i];
//                      j++;
//                  }
//              }
//                  return newArray;

    //2. Write a Java program to remove a specific element from an array.


    public int[] removeSpecificElement(int[] array, int element){

        //number is the number of times the element is found in the original array
        int number = 0;
        boolean found = false;

        //find the element in the original array
        for (int i = 0; i < array.length; i++){

            if(element == array[i]){

                number++;

                found = true;
            }
        }

        //if element is not found in the original array
        if(!found){

            return array;
        }

        //create a new array that will hold all the elements but the removed ones
        int[] newArray = new int[array.length - number];
        int j = 0;

        for (int i = 0; i < array.length; i++){

            if(element != array[i]){

                newArray[j] = array[i];
                j++;
            }
        }

        return newArray;
              }



        /*3.
            Scenario: Traffic ticketing system
            1. Speed Limit = 70
            2. Every 5 miles over the speed limit will add 1 point
            3. Use Math.floor(1.4)to round the speed to downward value
            4. If user reaches 12 points then license is suspended

            Example:
            userspeed=78(70-75->1point)
            userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)*/

    public String trafficTicketingSystem(int speedLimit,int userSpeed) {


        int milesOver = userSpeed - speedLimit;

        int licensePoints = Math.floorDiv(milesOver,5);

        String condition = "";

        if (licensePoints > 1 && licensePoints < 12){

            condition = "You have a total of " + licensePoints + " points.";

        } else if (licensePoints >= 12){

            condition = "You have reached: " + licensePoints + " points. Your license will be suspended.";
        }
        return condition;

        }
}


















