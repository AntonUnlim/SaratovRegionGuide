package com.example.saratovregionguide;

import android.net.Uri;

public class Link {
    private String name;
    private Uri address;

    public Link(String name, String address) {
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
