package PrepForMidterm;

public class Midterm {

    //Constructor
    public Midterm(){

    }

    //reverse a string


    public String reverseS (String name){

        String reverseS = "";

        int stringLength = name.length();

        for (int i = stringLength - 1; i >= 0; i--){

            reverseS += name.charAt(i);
        }

        return reverseS;

   }



    // reverse and Array

//    public int[] reverseAry(int[] mArray){
//
//        int arrayLength = mArray.length;
//
//        int lastIndex = arrayLength - 1;
//
//        int[] reversedArry = new int[arrayLength];
//
//        for (int i =0; i < arrayLength; i++){
//
//            reversedArry[i] = mArray[lastIndex-i];
//        }
//
//        return reversedArry;

   public int[] reverseAry (int[] myArray){

        int arrayLength = myArray.length;

        int lastIndex = arrayLength -1;

        int[] reversedArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){

            reversedArray[i] = myArray[lastIndex - i];
        }

        return reversedArray;
   }





    /* 3. Add all numbers in a given array*/

//    public int sumOf1(int[] myArray1){
//
//        int arrayLenght = myArray1.length;
//
//        int sum = 0;
//
//        for(int i = 0; i < arrayLenght; i++){
//
//            sum += myArray1[i];
//
//        }
//        return sum;

   public int sumOf1 (int[] myArray){

       int arrayLength = myArray.length;

       int sum = 0;

       for (int i = 0; i < arrayLength; i++){

           sum += myArray[i];
       }

       return sum;
   }




    /* 4. Sort an array */

//    public int[] sort1(int[] sArray){
//
//        int n = sArray.length;
//
//        int i,j,key;
//
//        for (i=1; i < n; i++){
//
//            key = sArray[i];
//
//            j = i - 1;
//
//            while (j >= 0 && sArray[j] > key){
//
//                sArray[j+1] = sArray[j];
//                sArray[j] = key;
//
//                --j;
//            }
//
//        }
//        return sArray;

    public int[] sort1 (int[] sArray){

        int n = sArray.length;

        int i,j,key;

        for (i = 1; i < n; i++){

            key = sArray[i];

            j = i - 1;

            while (j >=0 && sArray[j] > key){

                sArray[j +1] = sArray[j];

                sArray[j] = key;

                --j;
            }
        }
            return sArray;
        }




    /* 5. Find average of a given array*/

    public double findAverageOf1(int[] myArray2){

        int sum = 0;
        double average = 0;

        for (int i = 0; i < myArray2.length; i++ ){

            sum += myArray2[i];

            average = sum/myArray2.length;


        }
        return average;
    }

    /* 6. Find maximum of a given array*/

    public int maximum(int[] myArray){

        int max = myArray[0];

        for ( int i = 0; i < myArray.length; i++){

            if (myArray[i] > max){

                max = myArray[i];
            }
        }
        return max;
    }

    /* 7. Find minimum of given array*/

    public int minimum(int[] myArrayM){

        int min = myArrayM[0];

        for (int i = 0; i < myArrayM.length; i++){

            if (myArrayM[i] < min){

                min = myArrayM[i];
            }
        }

        return min;
    }

    /* 8. Abbreviation of a given string */

    public String abbreviationWord(String myString){

        String[] words = myString.split(" ");

        int length1 = words.length;

        String abbreviation = "";

        for (int i = 0; i <words.length; i++){

            abbreviation += words[i].charAt(0);

        }

        return abbreviation.toUpperCase();

    }

    /* 9. Fibonacci series, a and b are first two starting numbers in the series
    and n is the total numbers in the series*/

    public void fibonacci(int a, int b, int n){

        int c = 0;

        System.out.println(a + " " + b + " ");

        for (int i = 0; i < n - 2; i++){

            c = a + b;
            a = b;
            b = c;

            System.out.println(c + " ");
        }

        System.out.println();
    }

    /* 10. Maximum marks getter*/

    public String maximumMarksGetter(double[] marks, String[] names){

        double max = marks[0];
        int index = 0;
        String maxMarksGetter = null;

        for (int i = 1; i < marks.length; i++ ){

            if (marks[i] > max){

                max = marks[i];
                index = i;
            }
        }

        maxMarksGetter = names[index];

        return maxMarksGetter;

    }

    /* 11. Create a method to add numbers from 0 to given number(n), and return the result */

    public int addUpTo(int n){

        int sum = 0;

        for (int i = 1; i <= n; i++){

            sum += i;

        }

        return sum;

    }
}







