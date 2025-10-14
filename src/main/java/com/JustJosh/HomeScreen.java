package com.JustJosh;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class HomeScreen {

    public static void showHomeScreen() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the JJ's LLC Ledger");


//date|time|description|vendor|amount
        boolean runtime = true;

        while (runtime) {
            Thread.sleep(1000);
            System.out.println("PLease input a character if you would like to");
            System.out.println("D - Add Deposit");
            System.out.println("P - Make Payment Debit - Add Deposit");
            System.out.println("L -  Ledger");
            System.out.println("X -  Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "D":
                    System.out.println("Y/N Do you want to use the current time/date ");
                    String date = "";
                    String time = null;
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        LocalDateTime DateTime = LocalDateTime.now();
                        System.out.println();
                    } else {
                        System.out.println("please input the date of purchase");
                        date = scanner.nextLine().trim();
                        System.out.println("please input the time of purchase");
                        time = scanner.nextLine().trim();
                    }

                    System.out.println("please input the description of the purchase");
                    String description = scanner.nextLine().trim();

                    System.out.println("please input the vendor of purchase");
                    String vendor = scanner.nextLine().trim();
                    System.out.println("please input the cost of the item/s");
                    String cost = scanner.nextLine().trim();
                    String Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + cost;
                    System.out.println("Entry"+ Entry +" was added to ledger");

                    break;


                case "P":
                    System.out.println("please input your payment info for saving");
                    break;
                case "L":
                    System.out.println(" Opening ledger for viewing");
                    //code view ledger

                    break;
                case "X":
                    System.out.println("Exiting the JJ Ledge machine");
                    runtime = false;

                    break;
                default:
                    System.out.println("invalid responce ");
                    break;
            }
        }









    }

}
