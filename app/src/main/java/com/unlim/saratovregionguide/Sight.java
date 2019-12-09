package com.unlim.saratovregionguide;

import java.io.Serializable;

public class Sight implements Serializable {
    private int ID;
    private String shortName;
    private String longName;
    private String imagePath;
    private String text;

    public Sight(int ID, String shortName, String longName, String imagePath, String text) {
        this.ID = ID;
        this.shortName = shortName;
        this.longName = longName;
        this.imagePath = imagePath;
        this.text = text;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getText() {
        return text;
    }

    public int getID(){return ID;}
}
