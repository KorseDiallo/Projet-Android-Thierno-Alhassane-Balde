package com.example.testequatre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.Geolocalisation:
                Intent intent=new Intent(this, MapsActivity.class);
                startActivity(intent);
                return true;
            case R.id.Presentation:
                Intent intentdeux=new Intent(this, PresentationActivity.class);
                startActivity(intentdeux);
                return true;
            case R.id.aide:
                Intent intenttrois=new Intent(this, AideActivity.class);
                startActivity(intenttrois);
                return true;
            case R.id.consulter:
                Intent intentquatre=new Intent(this, ConsulterActivity.class);
                startActivity(intentquatre);
                return true;
            case R.id.liste_consultation:
                Intent intentcinq=new Intent(this, BDActivity.class);
                startActivity(intentcinq);
                return true;

        }

        return super.onOptionsItemSelected(item);

    }
}