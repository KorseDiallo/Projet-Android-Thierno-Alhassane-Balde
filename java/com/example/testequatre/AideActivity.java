package com.example.testequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AideActivity extends AppCompatActivity {

    public TextView aide;
    public Button btnConnection;
    public Button btnInscrire;
    public Button btnPrendre;
    public Button btnConsulter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide);

        aide=(TextView) findViewById(R.id.aide);
        aide.setText(" \n" +
                "\n" +
                "page aide  \"reponse \" a vos questions" +
                "\n");

        btnConnection=(Button) findViewById(R.id.btnConnection);
        btnInscrire=(Button) findViewById(R.id.btnInscrire);
        btnPrendre=(Button) findViewById(R.id.btnPrendre);
        btnConsulter=(Button) findViewById(R.id.btnConsulter);

        btnConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pour connecter il suffit de click sur le button Login et remplir le formulaire", Toast.LENGTH_LONG).show();
            }
        });

        btnInscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pour sincrire il suffit de click sur le button SignUp et remplir le formulaire", Toast.LENGTH_LONG).show();

            }
        });

        btnPrendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pour prendre un rendez-vous il suffit de click sur longlet Gestion de rendez et remplir le formulaire", Toast.LENGTH_LONG).show();

            }
        });

        btnConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pour la consultation il suffit de click longlet consultation envoyer le sms au docteur au numero 5556 ", Toast.LENGTH_LONG).show();

            }
        });
    }
}