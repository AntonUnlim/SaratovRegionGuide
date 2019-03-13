package com.example.saratovregionguide;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class RegionActivity extends AppCompatActivity {
    private Region currentRegion;
    private ImageView imageViewEmblem;
    private TextView textViewDistanceToSaratov;
    private TextView textViewTitle;
    private TextView textViewRegionalCenter;
    private WebView webMainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);

        int regionID = getIntent().getIntExtra(Data.INTENT_REGION_ID, -1);
        currentRegion = Data.findRegionByID(regionID);
        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewRegionalCenter = (TextView) findViewById(R.id.textViewRegionalCenter);
        webMainText = (WebView)findViewById(R.id.wv_main_text);
        textViewDistanceToSaratov = (TextView) findViewById(R.id.textViewDistanceToSaratov);

        // title
        textViewTitle.setText(currentRegion.getNominativeName());

        // distance to Saratov
        textViewDistanceToSaratov.setText("Расстояние Саратов - " + currentRegion.getNominativeRegionalCenter() + " " + currentRegion.getDistanceToSaratov());

        // emblem image
        imageViewEmblem = (ImageView) findViewById(R.id.imageViewEmblem);

        // emblem description
        webMainText.setBackgroundColor(getResources().getColor(R.color.colorGreen1, getBaseContext().getTheme()));
        webMainText.loadData(Data.HTML_START + currentRegion.getEmblemDescription() + Data.HTML_END, "text/html", "UTF-8");

        // button
        textViewRegionalCenter.setText(currentRegion.getNominativeRegionalCenter());
        try {
            InputStream inputStream = getAssets().open(currentRegion.getEmblemPath());
            Drawable image = Drawable.createFromStream(inputStream, null);
            imageViewEmblem.setImageDrawable(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
