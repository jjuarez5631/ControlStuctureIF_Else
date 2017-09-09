package com.example.java;
import java.util.Scanner;

//Create a program gets users body temperature.
// Displays if the body temperature is low, normal, or high.

public class Main {

    public static void main(String[] args) {
	//create Variables
        double userTemp;           //users temperature
        double lowTemp, highTemp; //comparison temperature

        Scanner scanner = new Scanner(System.in); //scanner to get users input.

        lowTemp = 97.5; //declare values
        highTemp = 99.5;
                        //ask user for temperature
        System.out.println("Please enter your body temperature: ");
        userTemp = scanner.nextDouble();
                        //determine and display temperature conditions
        if(userTemp <= lowTemp) {
            System.out.println("Your body temperature is low!");
        }else if (userTemp > lowTemp && userTemp < highTemp) {
            System.out.println("Your temperature is normal.");
        }else {
            System.out.println("Your body temperature is high!");
        }

    }
}
