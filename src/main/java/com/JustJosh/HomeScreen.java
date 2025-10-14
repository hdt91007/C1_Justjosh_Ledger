package com.JustJosh;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
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
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {

                case "D":
                    System.out.println("Y/N Do you want to use the current time/date ");
                    String date = "";
                    String time = null;
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        LocalDateTime DateTime = LocalDateTime.now();
                        date = String.valueOf(LocalDate.now());
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                        time = String.valueOf(LocalTime.now().format(formatter));

                        System.out.println(date +"|"+ time);

                    } else {
                        System.out.println("please input the date of deposit");
                        date = scanner.nextLine().trim();
                        System.out.println("please input the time of deposit");
//                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                        time = (scanner.nextLine().trim());
//                        time = (scanner.nextLine().trim().format(String.valueOf(formatter)));

                    }

                    System.out.println("please input the description of the deposit");
                    String description = scanner.nextLine().trim();

                    System.out.println("please input the recipeant of deposit");
                    String vendor = scanner.nextLine().trim();
                    System.out.println("please input the amount deposited");
                    String cost = scanner.nextLine().trim();
                    String Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + cost;
                    System.out.println("Entry"+ Entry +" was added to ledger");

                    break;


                case "P":
                    System.out.println("adding a purchase to ledger");
                    System.out.println("please input the description of the purchase");
                    System.out.println("please input the vendor of purchase");
                    System.out.println("please input the cost of the item/s");

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
