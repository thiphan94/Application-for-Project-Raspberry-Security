package com.example.rpi_l3mime;

public class ListData {
    private String name;
    private String date;
    private String time;

    public  ListData(){


    }

    public ListData(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return name;
    }

    public String getName() {
        return date;
    }

    public String getMovie() {
        return time;
    }
    public void setId(String name)
    {
        this.name = name;
    }

    public void setName(String date)
    {
        this.date = date;
    }

    public void setMovie(String time)
    {
        this.time = time;
    }


}
