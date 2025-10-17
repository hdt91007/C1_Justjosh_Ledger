package com.JustJosh;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.List;
import java.util.Scanner;


public class Reports {
    public static void displayByDateRange(List<Transaction> list, LocalDate startDate, LocalDate endDate) {
        for (Transaction t : list) {
            LocalDate date = t.getDate();

            // Check if date is between startDate and endDate (inclusive)
            if ((date.isEqual(startDate) || date.isAfter(startDate)) &&
                    (date.isEqual(endDate) || date.isBefore(endDate))) {

                System.out.println(t.toString());
            }
        }
    }
    public static void MonthtoDate(List<Transaction> transactions) {

        LocalDate today = LocalDate.now();
        LocalDate firstofmonth = today.withDayOfMonth(1);

        Reports.displayByDateRange(transactions,firstofmonth,today);

    }

    public static void ReportsDisplay() throws InterruptedException, FileNotFoundException {
        boolean runtime = true;
    Scanner scanner = new Scanner(System.in);
        while (runtime) {
            Thread.sleep(1000);
            System.out.println("Opening Reports");
            System.out.println("Please input character if you would like to Display");
            System.out.println("1 - Month to Date");
            System.out.println("2 - Previous Month");
            System.out.println("3 - Year to Date");
            System.out.println("4 - Previous Year");
            System.out.println("5 - Search by Vendor ");
            System.out.println("X - Exit Reports");

            String choice = scanner.nextLine().toUpperCase().trim();

            switch (choice) {

                case "1":
                    System.out.println("Displaying Month to Date");
                        ReadWrite.displayMonthtoDate(ReadWrite.getTransactionsFromCsv());
                    break;
                case "2":
                    System.out.println("Displaying Previous Month");

                    break;
                case "3":
                    System.out.println("Displaying Year to Date");
                    break;
                case "4":
                    System.out.println("Displaying Previous Year");
                    break;
                case "5":
                    System.out.println("Which Vendor would you like to search by?");
                    break;
                case "X":
                    System.out.println("Returning to Ledger");
                    break;




                    // look at all transactions
                    // filter by the date
                    //use
                    // choose all
//                LocalDate Current_Date = LocalDate.now();
//                System.out.println(Current_Date.getMonth());
//                System.out.println(Current_Date.minusMonths(1));
//                System.out.println(Current_Date);
            }


        }
    }
}