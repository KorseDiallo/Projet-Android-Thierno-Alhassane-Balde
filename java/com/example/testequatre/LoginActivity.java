package com.example.testequatre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText e1,e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db=new DatabaseHelper(this);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
          if(v==b1){
              String email=e1.getText().toString();
              String password=e2.getText().toString();
              Boolean chkemailpass=db.emailpassword(email,password);

              if(chkemailpass==true) {
                  //Toast.makeText(getApplicationContext(), "sucessfully Login", Toast.LENGTH_LONG).show();


                  Intent inte=new Intent(this,HomeActivity.class);
                  startActivity(inte);
              }
              else {
                  Toast.makeText(getApplicationContext(), "wrong email or password", Toast.LENGTH_LONG).show();
              }
          }
    }
}