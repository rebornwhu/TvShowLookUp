package com.xiaolu;

/**
 * Created by xiaolu on 4/12/15.
 */
public class TvShow {
    private String nameOfStation;
    private String channel;
    private int startTime; // elapsed minute from 00:00
    private int stopTime;
    private String nameOfShow; // search key
    private float rating; // can be 3.5, 4.2 and etc.
    private String description;

    public TvShow (String nameOfStation, String channel, int startTime, int stopTime,
                   String nameOfShow, float rating) {
        this.nameOfStation = nameOfStation;
        this.channel = channel;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.nameOfShow = nameOfShow;
        this.rating = rating;
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getStopTime() {
        return stopTime;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }

    public void setNameOfShow(String nameOfShow) {
        this.nameOfShow = nameOfShow;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}