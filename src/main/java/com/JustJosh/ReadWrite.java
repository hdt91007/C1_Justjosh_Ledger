package com.JustJosh;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

    public static List<Transaction> getTransactionsFromCsv() throws FileNotFoundException {

        ArrayList<Transaction> allTransaction = new ArrayList<>();
        //arrayList for later
        try {
            BufferedReader Reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            while ((line = Reader.readLine()) != null) {
                Transaction data = getTransaction(line);
                allTransaction.add(data);
            }
            //taking each line from buffered reader and converting to Transaction object
            //Then adding every line back into ArrayList allTransactions
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allTransaction;
        //returning all Values
    }

    public static Transaction getTransaction(String line) {
        String[] data = line.split("\\|");
//   converting the CsvEntry into an array of Date,Time,Description,Vendor,and Price
        LocalDate date = LocalDate.parse(data[0]);
        LocalTime time = LocalTime.parse(data[1]);
        String description = data[2];
        String vendor = data[3];
        Double price = Double.parseDouble(data[4]);
//Parse the data to correct type
        Transaction Return_Line = new Transaction(date, time, description, vendor, price);
        return Return_Line;

    }

    public static void DataEntry(String Entry) {
        try {

            FileWriter New_Entry = new FileWriter("transactions.csv", true);
            New_Entry.write("\n" + Entry);
            New_Entry.close();
            //takes input and inputs into csv
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void displayAll(List<Transaction> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());


        }
    }

    public void displaydeposits(List<Transaction> list) {

        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getCost() >= 0) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void displaypayments(List<Transaction> list) {
        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getCost() <= 0) {

                System.out.println(list.get(i).toString());

            }

        }
    }
    public static void displayMonthtoDate(List<Transaction> list) {
        LocalDate firstMonth = LocalDate.now().withDayOfMonth(1);
        //LocalDate firstMonth = LocalDate.now().getMonth();

        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getDate().isBefore(LocalDate.now()) && (list.get(i).getDate().isAfter(firstMonth))) {

                System.out.println(list.get(i).toString());

            }
        }
    }
    public static void displayPreviousMonth(List<Transaction> list) {
      LocalDate firstofLastMonth = LocalDate.now().minusMonths(1).withDayOfMonth(1);
        LocalDate lastofLastMonth = LocalDate.now().minusMonths(1).withDayOfMonth(30);

        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getDate().isBefore(lastofLastMonth) && (list.get(i).getDate().isAfter(firstofLastMonth))) {

                System.out.println(list.get(i).toString());

            }
        }
    }

    public static void displayYeartoDate(List<Transaction> list) {
        LocalDate Lastyear = LocalDate.now().minusYears(1);


        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getDate().isBefore(LocalDate.now()) && (list.get(i).getDate().isAfter(Lastyear))) {

                System.out.println(list.get(i).toString());

            }
        }
    }
    public static void displayPreviousYear(List<Transaction> list) {
        LocalDate Lastdayoflastyear = LocalDate.now().minusYears(1).withDayOfYear(365);
        LocalDate Firstdayoflastyear = LocalDate.now().minusYears(1).withDayOfYear(1);

        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getDate().isBefore(Lastdayoflastyear) && (list.get(i).getDate().isAfter(Firstdayoflastyear))) {

                System.out.println(list.get(i).toString());

            }
        }
    }
    public static void displaySpecificvendor (List<Transaction> list,String vendor) {

        for (var i = list.size() - 1; i > 0; i--) {
            if (list.get(i).getVendor().equals(vendor)) {

                System.out.println(list.get(i).toString());

            }
        }
    }
    }