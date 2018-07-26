package com.example.android.musicapp;

public class Songs {
    private String name;
    private String singer;
    private String time;

    public Songs(String name, String singer, String time) {
        this.name = name;
        this.singer = singer;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
