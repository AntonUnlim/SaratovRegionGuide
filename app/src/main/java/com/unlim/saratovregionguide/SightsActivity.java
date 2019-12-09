package com.unlim.saratovregionguide;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        databaseHelper = new DatabaseHelper(this);
        try {
            db = databaseHelper.getReadableDatabase();
        } catch (SQLException e) {
            throw e;
        }
        int regionID = getIntent().getIntExtra(Data.INTENT_REGION_ID, -1);
        final Region currentRegion = Data.findRegionByID(regionID);
        final boolean isRegion = getIntent().getBooleanExtra(Data.INTENT_IS_REGION, false);
        ArrayList<Sight> currentListOfSights = Data.getListOfSights(db, regionID, isRegion);
        TextView textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        LinearLayout linearLayoutSights = (LinearLayout) findViewById(R.id.linearLayoutSights);

        textViewTitle.setText("Достопримечательности\n" + ((isRegion) ? currentRegion.getGenitiveName() : currentRegion.getGenitiveRegionalCenter()));
        for (Sight sight : currentListOfSights) {
            TextView textView = Data.getStyledTextView(this, sight.getShortName());
            textView.setTag(sight);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SightsActivity.this, SightActivity.class);
                    intent.putExtra(Data.INTENT_SIGHT, (Serializable) v.getTag());
                    intent.putExtra(Data.INTENT_REGION_NAME, isRegion?currentRegion.getNominativeName():currentRegion.getNominativeRegionalCenter());
                    startActivity(intent);
                }
            });
            linearLayoutSights.addView(textView);
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        db.close();
    }
}
