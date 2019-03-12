package com.example.saratovregionguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;

public class RegionsActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRegions;
    private EditText editTextSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regions);

        linearLayoutRegions = (LinearLayout) findViewById(R.id.linearLayoutRegions);
        editTextSearch = (EditText) findViewById(R.id.editTextSearch);

        Data.fillRegions();

        fillListOfRegions("");

        TextWatcher searchWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                fillListOfRegions(editTextSearch.getText().toString());
            }
            @Override
            public void afterTextChanged(Editable s) { }
        };
        editTextSearch.addTextChangedListener(searchWatcher);
    }

    protected void onResume(){
        super.onResume();
        fillListOfRegions("");
        editTextSearch.setText("");
    }

    private void fillListOfRegions(String searchString){
        linearLayoutRegions.removeAllViews();
        for (Region region : Data.getListOfRegions()) {
            if (region.getNominativeName().toLowerCase().indexOf(searchString.toLowerCase()) == 0) {
                TextView textView = Data.getStyledTextView(this, region.getNominativeName());
                textView.setTag(region);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(RegionsActivity.this, RegionActivity.class);
                        intent.putExtra(Data.INTENT_REGION, (Serializable) v.getTag());
                        startActivity(intent);
                    }
                });
                linearLayoutRegions.addView(textView);
            }
        }
    }
}
