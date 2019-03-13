package com.example.saratovregionguide;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Data {
    public static final String INTENT_REGION_ID = "RegionID";
    public static final String INTENT_IS_REGION = "IsRegion";
    public static final String INTENT_SIGHT = "Sight";
    public static String HTML_START = "<html><head>" +
            "<style type=\"text/css\">" +
            "p {text-indent: 15px; text-align: justify;}" +
            "</style></head><body>";
    public static String HTML_END = "</body></html>";

    private static ArrayList<Region> listOfRegions;

    public static void fillRegions(SQLiteDatabase db) {
        listOfRegions = new ArrayList<>();

        String query = "SELECT _id, " +          // 0
                "NominativeName, " +             // 1
                "GenitiveName, " +               // 2
                "NominativeRegionalCenter, " +   // 3
                "GenitiveRegionalCenter, " +     // 4
                "EmblemPath, " +                 // 5
                "EmblemDescription, " +          // 6
                "DistanceToSaratov " +          // 7
                "FROM Region ORDER BY NominativeName";
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            listOfRegions.add(new Region(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getInt(7)
            ));
            cursor.moveToNext();
        }
        cursor.close();
    }

    public static ArrayList<Region> getListOfRegions() {
        return listOfRegions;
    }

    public static TextView getStyledTextView(Context context, String text){
        TextView textView = new TextView(context, null, 0, R.style.TextViewButtonStyle);
        textView.setText(text);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(10, 10, 10, 10);
        textView.setLayoutParams(layoutParams);

        return textView;
    }

    public static Region findRegionByID(int ID){
        for (Region region : getListOfRegions()){
            if (region.getID() == ID) return region;
        }
        return null;
    }

    public static ArrayList<Sight> getListOfSights(SQLiteDatabase db, int regionID, boolean isRegion){
        ArrayList<Sight> listOfSights = new ArrayList<>();
        String query = "SELECT _id, " +     // 0
                "ShortName, " +             // 1
                "LongName, " +              // 2
                "Image, " +                 // 3
                "Text " +                   // 4
                "FROM Sight " +
                "WHERE IsRegion = " + String.valueOf((isRegion)?1:0) +
                " AND " + "RegionID = " + regionID +
                " ORDER BY ShortName";
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            listOfSights.add(new Sight(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4)
            ));
            cursor.moveToNext();
        }
        cursor.close();
        return listOfSights;
    }
}