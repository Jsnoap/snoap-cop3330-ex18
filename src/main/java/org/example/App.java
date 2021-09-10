/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Program is designed to convert temp from C to F or from F to C given user input.
    public static void main( String[] args )
    {
        String type;
        double tempF, tempC;

        System.out.println("Press C to convert from Fahrenheit to Celsius or F to convert from Celsius to Fahrenheit.");
        Scanner inputType = new Scanner(System.in);
        type = inputType.next();
        type = type.toLowerCase();

        if (type.equals("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            Scanner inputTempF = new Scanner(System.in);
            tempF = inputTempF.nextDouble();

            tempC = (tempF - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + tempC);
        }
        else if (type.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            Scanner inputTempC = new Scanner(System.in);
            tempC = inputTempC.nextDouble();

            tempF = (tempC * 9 / 5) + 32;

            System.out.println("The temperature in Fahrenheit is " + tempF);
        }
    }
}
