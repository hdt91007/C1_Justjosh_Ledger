package com.JustJosh;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReadWrite {
    public static ArrayList<String> Entrys = new ArrayList<>();
    private List<Transaction> reader;

    public static List<Transaction>ReaderCSV() throws FileNotFoundException {


        BufferedReader resource = new BufferedReader(new FileReader("transactions.csv"));
        ArrayList<Transaction> allTransaction = new ArrayList<>();

        if (resource == null) {
            System.out.println("File not found!");
        }
//        File file = new File(resource.getFile());

        try {
            BufferedReader Reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            while ((line = Reader.readLine()) != null) {
                String[] data = line.split("\\|");//String[] data = { "10","Dana Wyatt","52.50","12.50" }
//                System.out.println(line);
                LocalDate date = LocalDate.parse(data[0]);
                LocalTime time = LocalTime.parse(data[1]);
                 String description = data[2];
                String vendor = data[3];
                Double price = Double.parseDouble(data[4]);

//                Transaction t1 = null;
//                t1.date = LocalDate.parse(data[0]);
//                t1.time = LocalTime.parse(data[1]);
//                t1.description = data[2];
//                t1.vendor = data[3];
//                t1.cost = Double.valueOf(data[4]);
                Transaction tv1 = new Transaction(date,time,description,vendor,price);
            allTransaction.add(tv1);





//                Entrys Entry = new Entrys(date, time, Description, Vendor, Price);
//                System.out.println(Entry.toString());
//                ReaderCsV.add();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allTransaction;
    }

    public static void DataEntry(String Entry) {
        try {

            FileWriter New_Entry = new FileWriter("transactions.csv", true);
            New_Entry.write("\n" + Entry);
            New_Entry.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void displayAll(List<Transaction> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}