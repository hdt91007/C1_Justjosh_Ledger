package com.JustJosh;

import java.io.*;
import java.util.ArrayList;

public class ReadWrite {
 ArrayList<String> Entrys = new ArrayList<String>();

    public static void ReaderCSV() throws FileNotFoundException {


        BufferedReader resource = new BufferedReader(new FileReader("transactions.csv"));

        if (resource == null) {
            System.out.println("File not found!");
            return;
        }
//        File file = new File(resource.getFile());

        try {
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
                System.out.println(data[0]+data[1]+data[2]+data[3]+data[4]);


//                Entrys Entry = new Entrys(date, time, Description, Vendor, Price);
//                System.out.println(Entry.toString());
//                ReaderCsV.add();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
public static void DataEntry(String Entry) {
    try {

        FileWriter New_Entry = new FileWriter("transactions.csv",true);
        New_Entry.write("\n"+Entry);
        New_Entry.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

}
