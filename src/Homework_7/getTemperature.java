package Homework_7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit



public class getTemperature {

    public static void main(String[] args) {

        //fahrenheit to celsius
        System.out.println("Fahrenheit to Celsius: " + ((getConvertedCelsius(60))));
        //celsius to kalvin
        System.out.println("\nCelsius to Kalvin: " + (getConvertedtoKalvin(20)));
        //Celsius to Fahrenheit
        System.out.println("\nCelsius to Fahrenheit: " + (getConvertedtoFahrenheit(20)));
        //Kelvin to Celsius
        System.out.println("\nKelvin to Celsius: " + (getConvertedtoCelsius(300)));
        //Kelvin to Fahrenheit
        System.out.println("\nKelvin to Fahrenheit: " + (getConvertedtoFahrenheitB(300)));
    }


    // fahrenheit to celsius
    public static double getConvertedCelsius(double fahrenheit){

        double celsius = (fahrenheit - 32) *5/9;
        return celsius;
    }

     //celsius to kalvin

    public static double getConvertedtoKalvin(double celsius){

        double kalvin = (celsius + 273.15 );
        return kalvin;
    }

    //celsius to fahrenheit

    public static double getConvertedtoFahrenheit(double celsiusB){

        double fahrenheit = (celsiusB *9/5 +32);
        return fahrenheit;
    }

    //Kelvin to Celsius

    public static double getConvertedtoCelsius(double kelvin){

        double celsiusC = (kelvin - 273.15);
        return celsiusC;
    }

    //Kelvin to Fahrenheit

    public static double getConvertedtoFahrenheitB(double kelvinB){

        double fahrenheitB = (kelvinB *9/5 - 459.67);
        return fahrenheitB;
    }

}
