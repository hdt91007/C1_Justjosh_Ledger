package com.JustJosh;

import javax.lang.model.element.VariableElement;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeScreen {
    public static void showHomeScreen() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Welcome to the JustJosh's LLC Ledger");


        boolean runtime = true;
        LocalDate date = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime time = null;
        Double cost = 0.0;
        boolean Valid = true;

        while (runtime) {
            Thread.sleep(1000);
            System.out.println("""
                            PLease input a character if you would like to
                                    D - Add Deposit
                                    P - Make Payment Debit
                                    L - Ledger
                                    X - Exit
                            
                            """);

            String choice = scanner.nextLine().toUpperCase().trim();

            switch (choice) {

                case "D":

                     date = LocalDate.now();
                     time = LocalTime.parse(LocalTime.now().format(formatter));
                        System.out.println(date + "|" + time);

                        System.out.println("please input what the deposit is for");
                        String description = scanner.nextLine().trim();

                        System.out.println("please input from whom the deposit is from");
                        String vendor = scanner.nextLine().trim();


                        System.out.println("please input amount depositing");
                        while(Valid) {
                            if (scanner.hasNextDouble()) {
                                cost = scanner.nextDouble();

                                break;
                            } else {
                                System.out.println("invalid response. please input a number");
                                scanner.nextLine();
                            }
                        }
                    String stringcost = df.format(cost);

                        String Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + stringcost;
                        ReadWrite.DataEntry(Entry);
                        System.out.println("Entry " + Entry + " was added to ledger");
                        break;


                case "P":
                    date = LocalDate.now(); //d1

                    time = LocalTime.parse(LocalTime.now().format(formatter)); //d2
                    System.out.println("please input the description of the purchase");
                     description = scanner.nextLine().trim(); //d3

                    System.out.println("please input the vendor of purchase"); //d4
                     vendor = scanner.nextLine().trim();


                    System.out.println("please input the cost of the item/s"); //d5
                    while(Valid) {
                        if (scanner.hasNextDouble()) {
                            cost = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("invalid response. please input a number");
                            scanner.nextLine();
                        }
                    }

                    cost = Double.valueOf(cost*-1);
                     stringcost = df.format(cost);
                    Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + stringcost;
                    ReadWrite.DataEntry(Entry);
                    System.out.println("Entry"+ Entry +" was added to ledger");
                    break;

                case "L":
                    Ledger.LedgerDisplay();
                    break;
                case "X":
                    System.out.println("Exiting the JJ Ledge machine"+"\n");
                    runtime = false;

                    break;
                default:
                    System.out.println("invalid response");
                    break;
            }
        }









    }

}
