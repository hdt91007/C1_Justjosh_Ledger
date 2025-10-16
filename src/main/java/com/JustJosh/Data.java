package com.JustJosh;

public class Data {
 String date;
 String time;
 String description;
 String vendor;
 String cost;

    public Data(String date, String description, String cost, String vendor, String time) {
        this.date = date;
        this.description = description;
        this.cost = cost;
        this.vendor = vendor;
        this.time = time;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
