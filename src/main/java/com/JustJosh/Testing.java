package com.JustJosh;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Testing {

public static void main(String[] args) {

    ArrayList<String> Entrys = new ArrayList<String>();
    try {
        ReadWrite.ReaderCSV();

//        Collections.sort();

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }


}
}
//                        try {
//        File myFile = new File(".csv");
//        FileWriter myWriter = new FileWriter(myFile,true);
//        myWriter.write("Files in Java might be tricky, but it is fun enough!");
//        myWriter.write("Files in Java might be tricky, but it is fun 22222enough!");
//        System.out.println("Y/N Do you want to use the current time/date ");
//        if (scanner.nextLine().equalsIgnoreCase("Y")) {
//            date = String.valueOf(LocalDate.now());
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
//            time = LocalTime.now().format(formatter);
//            myWriter.write(date);
//            System.out.println(date +"|"+ time);
//
//        } else {
//            System.out.println("please input the date of deposit");
//            date = scanner.nextLine().trim();
//            System.out.println("please input the time of deposit");
////                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//            time = (scanner.nextLine().trim());
////                        time = (scanner.nextLine().trim().format(String.valueOf(formatter)));
//
//        }
//
//        System.out.println("please input the description of the deposit");
//        description = scanner.nextLine().trim();
//
//        System.out.println("please input the recipient of deposit");
//        vendor = scanner.nextLine().trim();
//
//        System.out.println("please input the amount deposited");
//        cost = scanner.nextLine().trim();
//        Entry = date + "|" + time + "|" + description + "|" + vendor + "|" + cost;
//        FileWriter new_Entry = new FileWriter("transactions.csv", true);
//        try {
//            new_Entry.write(Entry+"\n");
//            new_Entry.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Entry"+ Entry +" was added to ledger");
//        myWriter.write(new_Entry.getEncoding());
//        myWriter.close();  // must close manually
//        System.out.println("Successfully wrote to the file.");
//    } catch (IOException e) {
//        System.out.println("An error occurred.");
//        e.printStackTrace();
//    }
//
//
////
//}
