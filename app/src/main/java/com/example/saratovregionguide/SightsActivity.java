package com.example.saratovregionguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        Region currentRegion = (Region) getIntent().getSerializableExtra(Data.INTENT_REGION);
        boolean isRegion = getIntent().getBooleanExtra(Data.INTENT_IS_REGION, false);
        ArrayList<Sight> currentListOfSights = (isRegion) ? currentRegion.getListOfRegionSights() : currentRegion.getListOfRegionalCenterSights();
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
                    startActivity(intent);
                }
            });
            linearLayoutSights.addView(textView);
        }
    }
}
