package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity  implements View.OnClickListener{


    Button addb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LIBRARY");

        setContentView(R.layout.activity_homepage);
        addb =(Button)findViewById(R.id.addk);


        addb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.equals(addb)){
            Intent intent = new Intent(Homepage.this,AddBooks.class);
            startActivity(intent);


        }

    }
}
