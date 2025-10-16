package com.JustJosh;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Ledger {


    private static Scanner scanner = new Scanner(System.in);

    public static void LedgerDisplay() throws InterruptedException, FileNotFoundException {

        System.out.println("Opening the ledger page");
         List<Transaction> list = ReadWrite.ReaderCSV();

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

            switch (choice) {
                case "A":
                        ReadWrite readWrite = new ReadWrite();
                        readWrite.displayAll(list);


                    break;
                case "D":
                    ReadWrite readWrite1 = new ReadWrite();
                    readWrite1.displaydeposits(list);


                    break;
                case "P":
                    readWrite;



                    break;


                case "R":


                    break;
                case "X":
                runtime=false;

                    break;
            }
//Ledger - All entries should show the newest entries first

// A) All - Display all entries
// D) Deposits - Display only the entries that are deposits into the account
// P) Payments - Display only  payments)
// R) Reports - A new screen that allows the user to run pre-defined
//reports or to run a custom search

            }
//            try {
//                    BufferedReader Reader = new BufferedReader(new FileReader("transactions.csv"));
//                    String line;
//                    while ((line = Reader.readLine()) != null) {
//                        String[] data = line.split("\\|");//String[] data = { "10","Dana Wyatt","52.50","12.50" }
//                        System.out.println(line);
//                        date = data[0];
//                         time = data[1];
//                        String Description = data[2];
//                        String Vendor = data[3];
//                        Double Price = Double.parseDouble(data[4]);
//                    }
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
                }

            }

