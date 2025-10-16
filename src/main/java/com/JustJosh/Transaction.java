package com.JustJosh;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    //Time date and cost could be converted into different from strings.
    LocalDate Date;
    LocalTime time;
    String description;
    String vendor;
    Double cost;

    public Transaction(LocalDate date, String description, LocalTime time, String vendor, Double cost) {
        Date = date;
        this.description = description;
        this.time = time;
        this.vendor = vendor;
        this.cost = cost;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
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
}

