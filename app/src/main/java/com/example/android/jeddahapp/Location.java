package com.example.android.jeddahapp;

/**
 * Created by ebtesam on 12/23/2017 AD.
 */

public class Location  {

    private String name;

    private String location;
    private int image = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public Location(String name, int image, String location) {
        this.name = name;
        this.image = image;
        this.location = location;
    }
    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }


    public boolean hasImage(){
        return image!=NO_IMAGE_PROVIDED;
    }
}
