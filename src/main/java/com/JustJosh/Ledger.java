package com.JustJosh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ledger {
    public static void ShowFull() {


             throws FileNotFoundException {
            try {
                FileReader fileReader = new FileReader("poeem.txt");
                BufferedReader bufReader = new BufferedReader(fileReader);

            }
            catch(Exception ex)
            {
                //  System.out.println(ex);
                System.out.println("File not found");
    }
}
