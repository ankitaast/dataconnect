package com.example.mylocation.dataconnect;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {
    public MyDatabase( Context context) {
        super(context, "mydatabase.db",null,  1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql= "create table student(email TEXT,password TEXT,branch TEXT)";
        db.execSQL(sql);
    }

    public void insertData(String email,String pass,String branch){
        ContentValues cv=new ContentValues();
        cv.put("email",email);
        cv.put("password",pass);
        cv.put("branch",branch);

        SQLiteDatabase db=getWritableDatabase();
        long i=db.insert("student",null,cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    onCreate(db);
    }
}
