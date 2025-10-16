package com.JustJosh;

public class Data {
private String Date;
private String time;
private String description;
private String vendor;
private String cost;

    public Data(String date, String description, String cost, String vendor, String time) {
        Date = date;
        this.description = description;
        this.cost = cost;
        this.vendor = vendor;
        this.time = time;

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
