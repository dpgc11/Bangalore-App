package com.example.android.bangalore;

/**
 * Created by Yogesh on 23-11-2016.
 */

public class Place {

    private String name;
    private String location;
    private long phone;
    private int imageResourceId;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public long getPhone() {
        return phone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public Place(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Place(String name, String location, long phone) {
        this(name, location);
        this.phone = phone;
    }

    public Place(String name, String location, long phone, int imageResourceId) {
        this(name, location, phone);
        this.imageResourceId = imageResourceId;
    }


}
