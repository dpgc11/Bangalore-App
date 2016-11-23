package com.example.android.bangalore;

/**
 * Created by Yogesh on 23-11-2016.
 */

public class Place {

    private String name;
    private String location;
    private String phone = "-1";
    private String cost = "-1";
    private int imageResourceId = -1;

    public Place(String name, String location, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public Place(String name, String location, String cost) {
        this.name = name;
        this.location = location;
        this.cost = cost;
    }

    public Place(String name, String location, String cost, String phone) {
        this(name, location, cost);
        this.phone = phone;
    }

    public Place(String name, String location, String cost, String phone, int imageResourceId) {
        this(name, location, cost, phone);
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getCost() {
        return cost;
    }

    public boolean hasCost() {
        return !cost.equals("-1");
    }

    public boolean hasImage() {
        if (imageResourceId != -1) {
            return true;
        }
        return false;
    }

    public boolean hasPhone() {
        return !phone.equals("-1");
    }


}
