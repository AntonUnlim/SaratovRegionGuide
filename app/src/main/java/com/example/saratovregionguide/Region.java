package com.example.saratovregionguide;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Region {

    private DatabaseHelper sqlHelper;
    private SQLiteDatabase db;
    private Cursor userCursor;

    public Region(Context context) {
        sqlHelper = new DatabaseHelper(context);
        db = sqlHelper.open();
    }

    private String select(int ID, String field) {
        String queryString = "SELECT " + field + " FROM Region WHERE _id = " + ID;
        userCursor = db.rawQuery(queryString, null);
        userCursor.moveToFirst();
        return userCursor.getString(0);
    }

    public String getNominativeName(int ID) {return select(ID, "NominativeName");}

    public String getGenitiveName(int ID) {return select(ID, "GenitiveName");}

    //public ArrayList<Sight> getListOfRegionalCenterSights() {return listOfRegionalCenterSights;}

    //public ArrayList<Sight> getListOfRegionSights() { return listOfRegionSights;}

    public String getNominativeRegionalCenter(int ID) {return select(ID, "NominativeRegionalCenter");}

    public String getGenitiveRegionalCenter(int ID){return select(ID, "GenitiveRegionalCenter");}

    public Drawable getEmblem(int ID) {
        String query = "SELECT Emblem FROM Region WHERE _id = " + ID;
        Cursor cur = db.rawQuery(query, null);

        if (cur.moveToFirst()){
            byte[] imgByte = cur.getBlob(0);
            cur.close();
            Drawable draw;
            draw = BitmapFactory.decodeByteArray(imgByte, 0, imgByte.length);
            return draw;

        }
        if (cur != null && !cur.isClosed()) {
            cur.close();
        }

        return null ;
    }

    public String getEmblemDescription() {
        return emblemDescription;
    }

    public String getDistanceToSaratov() {
        return distanceToSaratov + " км";
    }
}
