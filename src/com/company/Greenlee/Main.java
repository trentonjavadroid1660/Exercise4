package com.company.Greenlee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Write a program that first prompts the user to enter a list of city names, one
        at a time until the user specifies "END". Next, the program should prompt the
        user to enter the average daily temperature for each of the next five days for
        each city. The program should store the user's cities and temperature data in
        one data structure. Next, calculate the five-day average for each city.
        Finally, display a message containing the city's name and the average for each
        city.
        The code to prompt the user for input, to calculate the five-day average, and to
        display the results should be in separate methods.
        Hint: You can use String.split(" ") to split a string into an array of strings
        based on where spaces occur in the original string.*/
        city();
    }

    private static Scanner input = new Scanner(System.in);

    private static Map<String, Double> cityAvgTemp = new HashMap<>();

    public static void city() {
        Scanner input = new Scanner(System.in);
        Scanner temper = new Scanner(System.in);
        System.out.println("Please enter a city names: ");
        String user = input.nextLine();

        while (!(user.equals("END"))) {
            System.out.println("Enter 5-Day Temperature: ");
            for (int i = 0; i < 5; i++) {
                double temp = temper.nextDouble();
                double totalTemp = 0;
                totalTemp = temp + totalTemp;
            }
            //cityAvgTemp.put(user);
            System.out.println("Please enter a city names: ");
            user = input.next();
        }
    }

    public static void averageTemp(double average) {
        //for (int i = 0; i < )
    }


}