package com.example.ali_ateeq;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public Database(@Nullable Context context) {
        super(context, "Database.db", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS deals (id INTEGER PRIMARY KEY AUTOINCREMENT ,name TEXT ,phone TEXT ,location TEXT,road text ,building text) ");
        db.execSQL("CREATE TABLE IF NOT EXISTS tenders (id INTEGER PRIMARY KEY AUTOINCREMENT ,Uid INTEGER ,price Real ,sum Real) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }


    public void insertNewDeal(String name, String phone , String location , String road , String building ) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        if (name !=null){
            values.put("name" , name);
        }
        if (phone != null){
            values.put("phone",phone);
        }
        if (location != null){
            values.put("location",location);
        }
        if (road != null){
            values.put("road",road);
        }
        if (building != null){
            values.put("building",building);
        }
        db.insert("deals",null,values);




    }
}
