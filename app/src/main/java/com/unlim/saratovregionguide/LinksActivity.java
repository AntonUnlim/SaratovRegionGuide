package com.unlim.saratovregionguide;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LinksActivity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;
    private ArrayList<Link> listOfLinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        LinearLayout layout = (LinearLayout)findViewById(R.id.layoutLinks);

        databaseHelper = new DatabaseHelper(this);
        try {
            db = databaseHelper.getReadableDatabase();
        } catch (SQLException e) {
            throw e;
        }

        listOfLinks = new ArrayList<>();
        String query = "SELECT _id, " + // 0
                        "Name, " +      // 1
                        "Address " +    // 2
                        "FROM Link " +
                        "ORDER BY _id";
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            listOfLinks.add(new Link(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2)
            ));
            cursor.moveToNext();
        }
        cursor.close();

        for (final Link link : listOfLinks) {
            String name = link.getName().replace("\\n", "\n");
            TextView tv = Data.getStyledTextView(this, name);

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(link.getAddress());
                    startActivity(intent);
                }
            });
            layout.addView(tv);
        }
    }
}
