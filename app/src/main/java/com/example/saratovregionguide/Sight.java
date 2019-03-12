package com.example.saratovregionguide;

import java.io.Serializable;

public class Sight implements Serializable {
    private String shortName;
    private String longName;
    private String imagePath;
    private String textPath;

    public Sight(String shortName, String longName, String imagePath, String textPath) {
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
}
