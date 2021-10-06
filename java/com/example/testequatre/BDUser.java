package com.example.testequatre;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

//extends SQLiteOpenHelper
public class BDUser extends SQLiteOpenHelper {


    public BDUser(@Nullable Context context) {
        super(context,"hopital.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE user(id INTEGER PRIMARY KEY AUTOINCREMENT, nom VARCHAR(50), prenom VARCHAR(50),profession VARCHAR(50),maladie VARCHAR(50));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DELETE FROM user;");
    }

    public boolean addUser(String nom,String prenom,String profession,String maladie){

        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("nom", nom);
            cv.put("prenom", prenom);
            cv.put("profession", profession);
            cv.put("maladie", maladie);
            db.insert("user", null, cv);
            db.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public boolean updateUser(String nom,String prenom,String profession,String maladie){

        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("nom", nom);
            cv.put("prenom", prenom);
            cv.put("profession", profession);
            cv.put("maladie", maladie);
            db.update("user", cv, "maladie='"+maladie+"'", null);
            db.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public boolean deleteUser(String nom,String prenom,String profession,String maladie){

        try{
            SQLiteDatabase db = this.getWritableDatabase();
            //db.delete("user", "nom='"+nom+"'", null);
            db.delete("user", null, null);
            db.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public List<String> getUsers(){
        List<String> list = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            Cursor c = db.query("user", null, null, null, null, null, null, null);
            if(c!=null && c.getCount()>0)
            {
                c.moveToFirst();
                do {
                    String  nom = c.getString(c.getColumnIndex("nom"));
                    String prenom= c.getString(c.getColumnIndex("prenom"));
                    String profession = c.getString(c.getColumnIndex("profession"));
                    String maladie= c.getString(c.getColumnIndex("maladie"));
                    list.add(nom+"  /  "+prenom+"/"+profession+" /"+maladie);
                    c.moveToNext();

                }while (!c.isAfterLast());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }
    }


