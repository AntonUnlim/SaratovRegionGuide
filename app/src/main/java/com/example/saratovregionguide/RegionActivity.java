package com.example.saratovregionguide;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class RegionActivity extends AppCompatActivity {
    private Region currentRegion;
    private ImageView imageViewEmblem;
    private TextView textViewEmblemDescription;
    private TextView textViewDistanceToSaratov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);

        int regionID = getIntent().getIntExtra(Data.INTENT_REGION_ID, -1);
        currentRegion = Data.findRegionByID(regionID);
        TextView textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        TextView textViewRegionalCenter = (TextView) findViewById(R.id.textViewRegionalCenter);
        imageViewEmblem = (ImageView) findViewById(R.id.imageViewEmblem);
        textViewEmblemDescription = (TextView) findViewById(R.id.textViewEmblemDescription);
        textViewDistanceToSaratov = (TextView) findViewById(R.id.textViewDistanceToSaratov);

        textViewTitle.setText(currentRegion.getNominativeName());
        textViewRegionalCenter.setText(currentRegion.getNominativeRegionalCenter());
        try {
            InputStream inputStream = getAssets().open(currentRegion.getEmblemPath());
            Drawable image = Drawable.createFromStream(inputStream, null);
            imageViewEmblem.setImageDrawable(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        textViewEmblemDescription.setText(currentRegion.getEmblemDescription());
        textViewDistanceToSaratov.setText("Расстояние Саратов - " + currentRegion.getNominativeRegionalCenter() + " " + currentRegion.getDistanceToSaratov());
    }

    public void startRegionalCenterSights(View v) {
        Intent intent = new Intent(RegionActivity.this, SightsActivity.class);
        intent.putExtra(Data.INTENT_REGION_ID, currentRegion.getID());
        intent.putExtra(Data.INTENT_IS_REGION, false);
        startActivity(intent);
    }

    public void startRegionSights(View v) {
        Intent intent = new Intent(RegionActivity.this, SightsActivity.class);
        intent.putExtra(Data.INTENT_REGION_ID, currentRegion.getID());
        intent.putExtra(Data.INTENT_IS_REGION, true);
        startActivity(intent);
    }
}
