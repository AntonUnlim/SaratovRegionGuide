package com.example.saratovregionguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(getApplicationContext());
        try{
            databaseHelper.updateDataBase();
        }
        catch (IOException e){
            throw new Error("UnableToUpdateDatabase");
        }
    }

    public void startRegions(View view) {
        Intent intent = new Intent(this, RegionsActivity.class);
        startActivity(intent);
    }

    public void startLinks(View view) {
        Intent intent = new Intent(this, LinksActivity.class);
        startActivity(intent);
    }
}
