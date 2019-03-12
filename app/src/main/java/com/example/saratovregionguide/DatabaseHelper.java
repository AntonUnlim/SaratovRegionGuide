package com.example.saratovregionguide;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH;
    private static String DB_NAME = "db.db";
    private static final int DB_VERSION = 1;
    private Context myContext;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.myContext = context;
        this.DB_PATH = context.getFilesDir().getPath() + DB_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {    }

    public void createDB(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File file = new File(DB_PATH);
            if (!file.exists()){
                this.getReadableDatabase();
                inputStream = myContext.getAssets().open(DB_NAME);
                String outFileName = DB_PATH;
                outputStream = new FileOutputStream(outFileName);
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                int length;
                while ((length = inputStream.read(buffer)) > 0){
                    outputStream.write(buffer, 0, length);
                }
                outputStream.flush();
                outputStream.close();
                inputStream.close();
            }
        }
        catch (IOException e){
            Log.d("DatabaseHelper", e.getMessage());
        }
    }

    public SQLiteDatabase open() throws SQLException {
        return SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
    }
}
