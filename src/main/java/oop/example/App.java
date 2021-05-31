package oop.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double weight = 0;
        int gender;
        int numberOfDrinks;
        double volume;
        int timeElapsed;
        double rValue = 0.73;
        double BAC;

        weight = weight(input);

        gender = gender(input);

        numberOfDrinks = drinks(input);

        volume = volume(input);

        timeElapsed = timeElapsed(input);

        if(gender == 1)   {
            rValue = 0.66;
        }


        BAC = ((numberOfDrinks * 5.14) / (weight * rValue)) - (0.015 * timeElapsed);

        System.out.printf("Your BAC is %.2f\n", BAC);
        if(BAC >= 0.08)   {
            System.out.printf("It is not legal for you to drive.\n");
        }
        else   {
            System.out.printf("It is legal for you to drive,\n");
        }
        
    }
    public static double weight(Scanner input)   {
        System.out.printf("What is your weight? (lbs) ");
        try {
            return Double.parseDouble(input.nextLine());
        }
        catch(NumberFormatException ex)   {
            System.out.printf("Please input a number!\n");
            weight(input);
        }
        return 0;
    }

    public static int gender(Scanner input)   {
        System.out.printf("What is your gender? (0 = Male | 1 = Female) ");
        try {
            return Integer.parseInt(input.nextLine());
        }
        catch(NumberFormatException ex)   {
            System.out.printf("Please input a number!\n");
            gender(input);
        }
        return 0;
    }

    public static int drinks(Scanner input)   {
        System.out.printf("How many drinks did you have? ");
        try {
            return Integer.parseInt(input.nextLine());
        }
        catch(NumberFormatException ex)   {
            System.out.printf("Please input a number!\n");
            drinks(input);
        }
        return 0;
    }

    public static double volume(Scanner input)   {
        System.out.printf("How many ounces of alcohol did you consume? ");
        try {
            return Double.parseDouble(input.nextLine());
        }
        catch(NumberFormatException ex)   {
            System.out.printf("Please input a number!\n");
            volume(input);
        }
        return 0;
    }
    public static int timeElapsed(Scanner input)   {
        System.out.printf("How many hours has it been since your last drink? ");
        try {
            return Integer.parseInt(input.nextLine());
        }
        catch(NumberFormatException ex)   {
            System.out.printf("Please input a number!\n");
            timeElapsed(input);
        }
        return 0;
    }


}


