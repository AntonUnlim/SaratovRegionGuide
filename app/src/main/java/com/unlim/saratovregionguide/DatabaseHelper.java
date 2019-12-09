package com.unlim.saratovregionguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH;
    private static String DB_NAME = "db.db";
    private static final int DB_VERSION = 19;

    private Context myContext;
    private SQLiteDatabase db;
    private boolean isNeedToUpdate = false;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.myContext = context;
        if (android.os.Build.VERSION.SDK_INT >= 24)
            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
        else
            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";

        copyDataBase();
        this.getReadableDatabase();
    }

    public void updateDataBase() throws IOException {
        if (isNeedToUpdate) {
            File file = new File(DB_PATH + DB_NAME);
            if (file.exists()) file.delete();
            copyDataBase();
            isNeedToUpdate = false;
        }
    }

    private boolean checkDataBase(){
        File file = new File(DB_PATH + DB_NAME);
        return file.exists();
    }

    private void copyDataBase() {
        if (!checkDataBase()){
            this.getReadableDatabase();
            this.close();
            try{
                copyDBFile();
            }
            catch (IOException e){
                throw new Error("ErrorCopyDataBase");
            }
        }
    }

    private void copyDBFile()throws IOException {
        InputStream inputStream = myContext.getResources().openRawResource(R.raw.db);
        //InputStream inputStream = myContext.getAssets().open(DB_NAME);
        OutputStream outputStream = new FileOutputStream(DB_PATH + DB_NAME);
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

    public boolean openDataBase() throws IOException {
        db = SQLiteDatabase.openDatabase(DB_PATH + DB_NAME, null, SQLiteDatabase.CREATE_IF_NECESSARY);
        return db != null;
    }

    @Override
    public synchronized void close(){
        if (db != null) db.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) isNeedToUpdate = true;
    }

}
