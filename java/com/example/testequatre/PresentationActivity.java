package com.example.testequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PresentationActivity extends AppCompatActivity {

    public TextView paragraphe;
    public ImageView Image_hos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        paragraphe=(TextView) findViewById(R.id.paragraphe);
        paragraphe.setText("Gestion HOpital (@2021) ");


        Image_hos.setImageResource(R.mipmap.imagehopital);

    }
   
}