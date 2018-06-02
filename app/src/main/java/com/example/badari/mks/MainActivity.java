package com.example.badari.mks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText usr, psd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById(R.id.usr);
        psd = (EditText) findViewById(R.id.psd);
        btn = (Button) findViewById(R.id.btn);


        // }




               /* public void openingss( View v){
                if(usr.getText().toString().ccccequals("Admin") &&(psd.getText().toString().equals("Admin123") &&usr.length()>1&&psd.length()>1)) {


                    Toast.makeText(getApplicationContext(),"Logins Successfulll github commited",Toast.LENGTH_LONG).show();
                    Intent myintent=new Intent(MainActivity.this,NavigatorActivity.class);
                    startActivity(myintent);


                }*/

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usr.getText().toString().equals("Admin") && (psd.getText().toString().equals("Admin123") && usr.length() > 1 && psd.length() > 1)) {


                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                    Intent myintent = new Intent(MainActivity.this, NavigatorActivity.class);
                    startActivity(myintent);

                } else if (usr.length() == 0)

                {
                    usr.setError("UserName Cannot Be Empty");
                    usr.requestFocus();
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();

                } else if (psd.length() == 0)

                {
                    psd.setError("Password Cannot Be Empty");
                    psd.requestFocus();
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();

                }
            }

        });
    }}

