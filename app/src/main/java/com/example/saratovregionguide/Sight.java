package com.example.saratovregionguide;

import java.io.Serializable;

public class Sight implements Serializable {
    private int ID;
    private String shortName;
    private String longName;
    private String imagePath;
    private String textPath;

    public Sight(int ID, String shortName, String longName, String imagePath, String textPath) {
        this.ID = ID;
        this.shortName = shortName;
        this.longName = longName;
        this.imagePath = imagePath;
        this.textPath = textPath;
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

    public String getTextPath() {
        return textPath;
    }

    public int getID(){return ID;}
}
