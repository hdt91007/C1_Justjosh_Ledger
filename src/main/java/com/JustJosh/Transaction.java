package com.JustJosh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Transaction {
    LocalDate date;
    LocalTime time;
    String description;
    String vendor;
    Double cost;
//2025-10-15|12:05|Pears|josh|-12.32
    public Transaction(LocalDate date, LocalTime time,String description , String vendor, Double cost) {
        this.date = date;
        this.description = description;
        this.time = time;
        this.vendor = vendor;
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "\n" + date + "|" + time + "|" + description + "|" + vendor + "|" + cost ;
    }

        }

