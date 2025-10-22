package com.JustJosh;

import java.io.*;

public class Ledger {
    public static void LedgerDisplay() {
        try {
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader Reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            while ((line = Reader.readLine()) != null) {
                String[] data = line.split("\\|");//String[] data = { "10","Dana Wyatt","52.50","12.50" }
                System.out.println(line);
                String date = data[0];
                String time = data[1];
                String Description = data[2];
                String Vendor = data[3];
                Double Price = Double.parseDouble(data[4]);
                //  System.out.println(ex);
                System.out.println("File not found");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
