package com.JustJosh;

public class Transaction {
    String Date;
    String time;
    String description;
    String vendor;
    String cost;

    public Transaction(String date, String time, String description, String vendor, String cost) {
        this.Date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.cost = cost;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}


