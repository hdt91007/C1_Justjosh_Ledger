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
            System.out.println("Please input one of the following character if you would like to Display");
            System.out.println("        1 - Month to Date");
            System.out.println("        2 - Previous Month");
            System.out.println("        3 - Year to Date");
            System.out.println("        4 - Previous Year");
            System.out.println("        5 - Search by Vendor");
            System.out.println("        X - Exit Reports");

            String choice = scanner.nextLine().toUpperCase().trim();

            switch (choice) {

                case "1":
                    System.out.println("Displaying Month to Date");
                        ReadWrite.displayMonthtoDate(ReadWrite.getTransactionsFromCsv());
                    break;
                case "2":
                    System.out.println("Displaying Previous Month");
                        ReadWrite.displayPreviousMonth(ReadWrite.getTransactionsFromCsv());
                    break;
                case "3":
                    System.out.println("Displaying Year to Date");
                    ReadWrite.displayYeartoDate(ReadWrite.getTransactionsFromCsv());

                    break;
                case "4":
                    System.out.println("Displaying Previous Year");
                    ReadWrite.displayPreviousYear(ReadWrite.getTransactionsFromCsv());

                    break;
                case "5":
                    System.out.println("Which Vendor would you like to search by?");
                    ReadWrite.displaySpecificvendor(ReadWrite.getTransactionsFromCsv(),scanner.nextLine());
                    break;
                case "X":

                    System.out.println("Returning to Ledger");
                    Thread.sleep(1000);
                    runtime = false;
                    break;
                default:
                    System.out.println("invalid responce");
                    break;




            }


        }
    }
}