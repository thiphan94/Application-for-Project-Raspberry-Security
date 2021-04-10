package com.example.rpi_l3mime;

public class ListData {

    private String date;

    private String name;

    private String time;

    public  ListData(){


    }

    public ListData(String name, String date, String time) {
        this.date = date;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

}
