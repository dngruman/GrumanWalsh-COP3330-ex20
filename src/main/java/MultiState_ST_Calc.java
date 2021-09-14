/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;
public class MultiState_ST_Calc {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double tax, Total;

        System.out.print("What is the order amount? ");
        double amount = user_input.nextDouble();
        System.out.print("What is the state? ");
        String state = user_input.next();

        if (state.equalsIgnoreCase("WI")) {
            System.out.print("What county do you live in? ");
            String county = user_input.next();

            if (county.equalsIgnoreCase("Eau Claire")) {
                tax = amount * (5.005 / 100);
                Total = amount + tax;
                System.out.println("The tax is " + tax + "\nThe total is" + Total);
            }

            if (county.equalsIgnoreCase("Eau Claire")) {
                tax = amount * (5.004 / 100);


            } else {
                tax = amount * (5 / 100);
            }

        }

        if (state.equalsIgnoreCase("IL")){
            tax = amount * (8 / 100);
        }
        else{
            tax = 0;
        }

        Total = amount + tax;
        System.out.println("The tax is " +tax+ "\nThe total is " +Total);

    }
}
