package com.example.saratovregionguide;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class SightActivity extends AppCompatActivity {
    private Sight currentSight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight);

        TextView textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        TextView textViewRegionName = (TextView) findViewById(R.id.textViewRegionName);
        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        WebView webViewText = (WebView) findViewById(R.id.webViewText);

        currentSight = (Sight) getIntent().getSerializableExtra(Data.INTENT_SIGHT);
        String regionName = getIntent().getStringExtra(Data.INTENT_REGION_NAME);

        // region or center name
        textViewRegionName.setText(regionName);

        // title
        String longName = currentSight.getLongName().replace("\\n", "\n");
        textViewTitle.setText((currentSight.getLongName().equals("")) ? currentSight.getShortName() : longName);

        // image
        /*try {
            InputStream inputStream = getAssets().open(currentSight.getImagePath());
            Drawable image = Drawable.createFromStream(inputStream, null);
            imageView.setImageDrawable(image);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // text
        String textMain = currentSight.getText();
        webViewText.setBackgroundColor(getResources().getColor(R.color.colorGreen1, getBaseContext().getTheme()));
        webViewText.loadData(Data.HTML_START + textMain + Data.HTML_END, "text/html", "UTF-8");
    }
}
