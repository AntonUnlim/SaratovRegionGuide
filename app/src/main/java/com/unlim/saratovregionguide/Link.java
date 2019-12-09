package com.unlim.saratovregionguide;

import android.net.Uri;

public class Link {
    private int ID;
    private String name;
    private Uri address;

    public Link(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = Uri.parse(address);
    }

    public String getName() {
        return name;
    }
    public Uri getAddress() {
        return address;
    }
}
