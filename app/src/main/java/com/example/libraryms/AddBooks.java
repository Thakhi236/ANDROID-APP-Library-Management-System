package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class AddBooks extends AppCompatActivity implements View.OnClickListener{

    private ZXingScannerView scannerView;
    TextView isbnd;
    private static  String res="ggg";
    Button p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_books);
        getSupportActionBar().setTitle("Scan ISBN code");
        isbnd =(TextView)findViewById(R.id.isbnn);
        isbnd.setOnClickListener(this);
        p=(Button)findViewById(R.id.dp);

        p.setOnClickListener(this);
    }




    public  void  scancode(View view){

        scannerView = new ZXingScannerView(this);
        scannerView.setResultHandler(new ZXingscannerResultsHandler());


        setContentView(scannerView);
        scannerView.startCamera();

    }

    @Override
    public void onPause(){

        super.onPause();
        scannerView.stopCamera();
    }

    @Override
    public void onClick(View view) {
        if(view.equals(p)){
            //String k="";
            //Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
            isbnd.setText(res);
        }





    }


    class ZXingscannerResultsHandler implements  ZXingScannerView.ResultHandler{

        String line;
        @Override
        public void handleResult(Result result) {
            line=result.getText().toString();
           res =result.getText();
            Toast.makeText(getApplicationContext(),res, Toast.LENGTH_SHORT).show();
            //setContentView(R.layout.activity_add_books);
            if(!res.equals("")){

                Intent intent = new Intent(AddBooks.this,AddBooks.class);
                startActivity(intent);

            }
            scannerView.stopCamera();




        }
    }









}
