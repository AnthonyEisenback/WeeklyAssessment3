package com.company.Question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
    Scanner scanner = new Scanner(System.in);

    public void method() {

        try {
            System.out.println("1.) Play a game \n" +
                    "2.) Browse the Web \n" +
                    "3.) Scan for viruses \n" +
                    "4.) Quit Program");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("You play a game for 3 hours and come back \n what would you like to do now?");
                    method();
                    break;

                case 2:
                    System.out.println("You Browse for images of cows for some reason and get bored \n you come back to your computer to do what now?");
                    method();
                    break;
                case 3:
                    System.out.println("Your pc scans itself for 20 minutes and reports you have 3000 viruses!!!");
                    method();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                        System.out.println("You have not selected an option that is valid \n please try again!");
                        method();
                        break;
            }

        } catch (InputMismatchException ime) {
            method();
            System.out.println("Please enter a number");
        }
    }


}
