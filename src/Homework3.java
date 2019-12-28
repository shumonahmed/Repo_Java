public class Homework3 {

    public static void main(String[] args) {


        //Homework_3


        //celsius to kalvin

        double celsius = 30;
        double kalvin = (celsius + 273.15);
        System.out.println("The temperature in Kelvin is: " + kalvin);
        System.out.println();

        //kalvin to fahrenheit

        double kalvintwofahrenheit = (kalvin * 9 / 5 - 459.67);
        System.out.println("The temperature in Fahrenheit is:" + kalvintwofahrenheit);
        System.out.println();

        // celsius to fahrenheit

        double celsiustwofahrenheit = (celsius * 9 / 5 + 32);
        System.out.println("The temperature in Fahrenheit is:" + celsiustwofahrenheit);
        System.out.println();


        //kalvin to celsius

        double kalvintocelsius = (kalvin - 273.15);
        System.out.println("The temperature in Celsius is: " + kalvintocelsius);
        System.out.println();


        System.out.println("End");
    }

}