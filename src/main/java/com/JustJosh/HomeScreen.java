package com.JustJosh;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeScreen {

    public static void showHomeScreen() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the JJ's LLC Ledger");


//date|time|description|vendor|amount
        boolean runtime = true;

        while (runtime) {
            Thread.sleep(1000);
            System.out.println("PLease input a character if you would like to");
            System.out.println("D - Add Deposit");
            System.out.println("P - Make Payment Debit ");
            System.out.println("L -  Ledger");
            System.out.println("X -  Exit");
            String choice = scanner.nextLine().toUpperCase().trim();
            String date;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
            String time;
            switch (choice) {

                case "D":

                    System.out.println("Y/N Do you want to use the current time/date ");
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        date = String.valueOf(LocalDate.now());
                        time = String.valueOf(LocalTime.now().format(formatter));
                        System.out.println(date +"|"+ time);}

                    else {
                        System.out.println("please input the date of purchase");
                        date = scanner.nextLine().trim();
                        System.out.println("please input the time of purchase");
                        time = scanner.nextLine().trim();
                    }

                    System.out.println("please input what the deposit is for");
                    String description = scanner.nextLine().trim();
                    //consider using null values for some of the deposits or pre assignning


                    System.out.println("please input from whom the deposit is from");
                    String vendor = scanner.nextLine().trim();
                    System.out.println("please input amount depositing");
                    String cost = scanner.nextLine().trim();
                    String Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + cost;
                    ReadWrite.DataEntry(Entry);
                    System.out.println("Entry"+ Entry +" was added to ledger");
                    break;


                case "P":
                    date = String.valueOf(LocalDate.now()); //d1

                    time = String.valueOf(LocalTime.now().format(formatter)); //d2
                    System.out.println("please input the description of the purchase");
                     description = scanner.nextLine().trim(); //d3

                    System.out.println("please input the vendor of purchase"); //d4
                     vendor = scanner.nextLine().trim();
                    System.out.println("please input the cost of the item/s"); //d5
                     cost = scanner.nextLine().trim().toString();

                    cost = String.valueOf((Double.parseDouble(cost)*-1));
                     Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + cost;
                    ReadWrite.DataEntry(Entry);
                    System.out.println("Entry"+ Entry +" was added to ledger");
                    break;
                case "L":
                    Ledger.LedgerDisplay();
                    break;
                case "X":
                    System.out.println("Exiting the JJ Ledge machine");
                    runtime = false;

                    break;
                default:
                    System.out.println("invalid responce");
                    break;
            }
        }









    }

}
