package com.example.testequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class BDActivity extends AppCompatActivity  {

    public EditText txtName,txtFirstName,txtMaladie,txtProfession;
    public Button btnajouter,btnmodifier,btnsupprimer,btnliste;
    private BDUser BDUser;
    private String nom, prenom,profession,maladie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_d);

        txtName= findViewById(R.id.txtName);
        txtFirstName= findViewById(R.id.txtFirstName);
        txtProfession=findViewById(R.id.txtProfession);
        txtMaladie= findViewById(R.id.txtMaladie);

        btnajouter=findViewById(R.id.btnajouter);
        btnsupprimer=findViewById(R.id.btnsupprimer);
        btnliste=findViewById(R.id.btnliste);
        btnmodifier=findViewById(R.id.btnmodifier);

        BDUser = new BDUser(this);//creer la base de données

        //btnAdd.setOnClickListener(new View.OnClickListener()
        btnajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = txtName.getText().toString().trim();
                prenom = txtFirstName.getText().toString().trim();
                profession = txtProfession.getText().toString().trim();
                maladie= txtMaladie.getText().toString().trim();

                boolean b = BDUser.addUser(nom,prenom,profession,maladie);
                if(b)
                {
                    Toast.makeText(BDActivity.this, "Patient ajouté", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(BDActivity.this, "Patient non ajouté", Toast.LENGTH_SHORT).show();
                }
            }
        });

           // View.OnClickListener()
        btnmodifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nom = txtName.getText().toString().trim();
                prenom = txtFirstName.getText().toString().trim();
                profession = txtProfession.getText().toString().trim();
                maladie= txtMaladie.getText().toString().trim();

                boolean b = BDUser.addUser(nom,prenom,profession,maladie);
                if(b)
                {
                    Toast.makeText(BDActivity.this, "Patient modifié", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(BDActivity.this, "Patient non modifié", Toast.LENGTH_SHORT).show();
                }



            }
        });

        btnsupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nom = txtName.getText().toString().trim();
                prenom = txtFirstName.getText().toString().trim();
                profession = txtProfession.getText().toString().trim();
                maladie= txtMaladie.getText().toString().trim();

                boolean b = BDUser.deleteUser(nom,prenom,profession,maladie);
                if(b)
                {
                    Toast.makeText(BDActivity.this, "Patient supprimé", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(BDActivity.this, "Patient non supprimé", Toast.LENGTH_SHORT).show();
                }
            }
        });


     btnliste.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             List<String> list = BDUser.getUsers();
             if(list.size()==0)
                 Toast.makeText(BDActivity.this, "La liste est vide", Toast.LENGTH_SHORT).show();
             for (int i = 0; i <list.size() ; i++) {

                 Toast.makeText(BDActivity.this, list.get(i), Toast.LENGTH_SHORT).show();
             }
         }
     });
    }



}