package com.JustJosh;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Ledger {


    private static Scanner scanner = new Scanner(System.in);

    public static void LedgerDisplay() throws InterruptedException, FileNotFoundException {

        System.out.println("Opening the ledger page");
        List<Transaction> list = ReadWrite.getTransactionsFromCsv();

        boolean runtime = true;
        String date;
        String time;

        while (runtime) {

            Thread.sleep(1000);
            System.out.println("PLease input a character if you would like to");
            System.out.println("A - Display all entries");
            System.out.println("D - Display deposits");
            System.out.println("P - Display payments ");
            System.out.println("R - Look for specific information ");

            System.out.println("X -  Exit");

            String choice = scanner.nextLine().toUpperCase().trim();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
            ReadWrite readWrite = new ReadWrite();

            switch (choice) {
                case "A":
                    readWrite.displayAll(list);


                    break;
                case "D":
                    readWrite.displaydeposits(list);


                    break;
                case "P":
                    readWrite.displaypayments(list);


                    break;


                case "R":
                    Reports.ReportsDisplay();

                    break;
                case "X":
                    runtime = false;

                    break;
            }


        }

    }
}
