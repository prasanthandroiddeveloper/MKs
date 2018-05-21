package com.example.badari.mks;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Badari on 31-01-2018.
 */

public class ThirdFragement extends Fragment {
    Button btn;


    View myView;
    @Nullable
    @Override

   /*public void onCreate(Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);*/

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.third_layout,container,false);

       //Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.2captcha.com"));
      //startActivity(browserIntent);

        //Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
        Intent myintent = new Intent(getActivity(), loggedActivity.class);
        startActivity(myintent);

        return myView;

    }

    /*public void open(View view){

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.2captcha.com"));
        startActivity(browserIntent);*/

}


